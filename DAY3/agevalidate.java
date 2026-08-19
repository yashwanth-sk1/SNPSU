package DAY3;

import java.util.Scanner;

class agevalidate {
	static void validate(int age) {
		if (age < 18) {
		
			throw new ArithmeticException("not elgible for vote");
		} else {
			System.out.println("u can vote");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your age ");
		int n = s.nextInt();
		validate(n);
		System.out.println("rest of the code");
	}
}