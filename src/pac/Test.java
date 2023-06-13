package pac;

public class Test {

	public static void main(String[] args) {
		for (int i = 1; i <=5 ; i++) {
			//Singleton s = Singleton.getInstance();
			//s.traiter("T" + i);
			ThreadTask t = new ThreadTask("T" + i);
			t.start();
			
		}	
	}
}
