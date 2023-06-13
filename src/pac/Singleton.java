package pac;

public class Singleton {
	
	private static final Singleton singleton;
	
	private int compteur;
	
	static {
		singleton=new Singleton();
	}
	
	private Singleton() {
		System.out.println("Instanciation du singleton....");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
	
	public void traiter(String taskName) {
		System.out.println("Traitement de la tache " + taskName);
		for(int i=1;i<=5;i++) {
			// synchronisation de la variable compteur zone critique
			synchronized(this) {
				++compteur;
			}
			
			System.out.println(".." + compteur);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //1s
			
		}
		System.out.println("Fin du traitement de la tache" 
		+ taskName + "Compteur="+ compteur);
	}
}
