package Project_Java;

public class ArithemeticOperation {

	void add(int a, int b) {
		System.out.println("Addition :"+(a+b));
	}
	void sub(int a, int b) {
		System.out.println("Substraction :"+(a-b));
	}
	void mult(int a, int b) {
		System.out.println("Multiplication :"+(a*b));
	}
	void div(int a, int b) {
		System.out.println("Division :"+(a/b));
	}

	public static void main(String[] args) {
		ArithemeticOperation AO = new ArithemeticOperation();
		AO.add(5,6);
		AO.sub(6,5);
		AO.mult(5,6);
		AO.div(6,2);
	}

}