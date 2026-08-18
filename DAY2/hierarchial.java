package DAY2;

class First{
	void cancer() {
		System.out.println("Cancer");
	}
}

class second extends First{
	void bp() {
		System.out.println("High bp");
	}
}
public class hierarchial extends First {
	public static void main(String[] args) {
		hierarchial hh = new hierarchial();
		hh.cancer();
	}
}
