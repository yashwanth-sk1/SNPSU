package DAY2;

interface ATM{
	abstract void depo();
	abstract void with();
}

abstract class xyz implements ATM{
	public void depo() {
		System.out.println("Depo");
	}
}
public class multipleIn extends xyz {
	public void with() {
		System.out.println("with");
	}
	public static void main(String[] args) {
		multipleIn mint = new multipleIn();
		mint.depo();
		mint.with();
	}
}