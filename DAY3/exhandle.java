package DAY3;

public class exhandle {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		try {
			System.out.println(10/2);
			int[] a = {0,1,2};
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array exception Handled");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception Handled");
		} 
	}

}
