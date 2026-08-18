package DAY2;

class par {
	void cancer() {
		System.out.println("Cancer");
	}
}
class child extends par {
	void bp() {
		System.out.println("High bp");
	}
}
public class Multilevel  extends child {
	public static void main(String[] args) {
		Multilevel ml = new Multilevel();
		ml.cancer();
		ml.bp();
	}
}
