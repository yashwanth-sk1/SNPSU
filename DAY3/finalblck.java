package DAY3;

public class finalblck {

	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			System.out.println(10/0);
		}
		catch(NullPointerException e) {
			System.out.println("NP exception Handled");
		}
		finally {
			System.out.println("fianlly block Will execute always");
		}
		System.out.println("rest of code");
	}

}
