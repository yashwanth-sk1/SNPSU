package DAY7;

public class class101 {
	static void methodA() {
		System.out.println("Inside methodA");
		methodB();
		System.out.println("Back to methodA");
	}
	static void methodB() {
		System.out.println("Inside methodB");
	}
	public static void main(String[] args) {
		System.out.println("Inside main");
		methodA();
		System.out.println("Back to main");
	}
}
