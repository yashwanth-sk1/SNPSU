package DAY2;

interface Atm
{
	abstract void depo();	
	abstract void with();
}
abstract class Abc implements Atm
{	
	public	void depo()
	{
		System.out.println("Depos");
	}
	}

public class demoIn extends Abc{

	public	void with()
	{
		System.out.println("With");
	}
	
public static void main(String[] args) {
	demoIn   v = new demoIn();
	v.depo();
	v.with();
}
}
