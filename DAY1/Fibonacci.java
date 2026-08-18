package Project_Java;

public class Fibonacci {
	
	void Fib(int n) {
		int first = 0;
		int second = 1;
		
		for(int i=0; i<n; i++) {
			System.out.println(first+" ");
			int next = first + second;
			first = second;
			second = next;
		}
	}
	
	public static void main(String[] args) {
		Fibonacci FB = new Fibonacci();
		FB.Fib(10);
	}
}
