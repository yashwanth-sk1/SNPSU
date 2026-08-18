package Project_Java;

public class Demo {
	int a = 66; // instance 
   static	int cc = 99;
	void m1() {
		int a = 10;
		System.out.println("gsdfgsdkl" + a);
	}
	public Demo() {
		int b = 10;
		System.out.println("sdf" + b);
	}
	public static void main(String[] args) {
		Demo test = new Demo();// object
		test.m1();
		System.out.println("tyhank you"+test.a);
		System.out.println(cc);
		System.out.println(Demo.cc);

	}
}
