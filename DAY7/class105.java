package DAY7;

public class class105 {
	public static void main(String[] args) {
		int amount = 10000;
		int wd = 2000;
		while(amount != 0) {
			amount -= wd;
			System.out.println("Withdraw done balance : "+amount);
		}
	}
}
