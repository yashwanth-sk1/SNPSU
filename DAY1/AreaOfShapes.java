package Project_Java;

public class AreaOfShapes {
	
	 double circle(int r) {
		 return 3.14 * r * r;
	}
	 double triangle(int b, int h) {
		 return 0.5 * b * h;
	}
	 double rectangle(int l, int b) {
		 return l*b;
	 }
	public static void main(String[] args) {
		AreaOfShapes AS = new AreaOfShapes();
		System.out.println("Area Of Circle " +AS.circle(4));
		System.out.println("Area of Traingle " +AS.triangle(5,6));
		System.out.println("Area of Rectangle "+AS.rectangle(2,3));
	}

}
