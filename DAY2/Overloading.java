package DAY2;

public class Overloading {
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	void add(double a, double b) {
		System.out.println(a+b);
	}
	
	public static void main(String args[]) {
		Overloading OL = new Overloading();
		OL.add(1, 2);
		OL.add(1, 2,3);
		OL.add(1.2,2.1);
		
	}
}

