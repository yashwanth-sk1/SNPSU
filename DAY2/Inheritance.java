package DAY2;

class Parent
{
	void cancer()
	{
		System.out.println("cancer ");
	}
	void bp()
	{
		System.out.println("high bp");
	}
}

public class Inheritance extends Parent{

	public static void main(String[] args) {
 		Inheritance  bb= new Inheritance();
 		bb.bp();
 		bb.cancer();
	}
}