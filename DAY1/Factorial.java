package Project_Java;

public class Factorial {
	int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		} else {
			return n * fact(n-1);
		}
	}
	
	public static void main(String[] args) {
		Factorial Fact = new Factorial();
		int answer = Fact.fact(5);
		System.out.println("Factorial of 5" +answer);

	}

}
