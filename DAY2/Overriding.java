package DAY2;

class parent {
	void property() {
		System.out.println("Property");
	}
}
public class Overriding extends parent {
	void property() {
		System.out.println("Overriding Parent Property");
	}
	public static void main(String args[]) {
		Overriding OV = new Overriding();
		OV.property();
	}
	
}




