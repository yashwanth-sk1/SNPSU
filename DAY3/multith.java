package DAY3;

public class multith extends Thread {
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Method "+i);
		}
	}
	public static void main(String[] args) {
		multith db = new multith();
		db.start();
		for(int i=0; i<5; i++) {
			System.out.println("Main method "+i);
		}
	}
}
