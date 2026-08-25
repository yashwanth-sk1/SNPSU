package DAY6;

public class practice3 {
	public static void main(String[] args) {
		int[] n = {10,20,30,40,50};
		int windowsize = 3;
		int sum = 0;
		for(int i=0; i<windowsize; i++) {
			sum = sum + n[i];
		}
		System.out.println("Sum : "+sum);
		int start = 0;
		for(int end = windowsize; end<n.length; end++) {
			sum = sum - n[start];
			sum = sum + n[end];
			start ++;
			System.out.println("Sum = " +sum);
		}
	}
}
