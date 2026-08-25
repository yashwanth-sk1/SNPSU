package DAY6;

public class practice6 {
	public static void main(String[] args) {
		int [] n = {2,3,1,2,4,3};
		int target = 7;
		int start = 0;
		int sum = 0;
		int minlength = n.length;
		for(int end=0; end<n.length; end++) {
			sum = sum +n[end];
			while(sum >= target) {
				int length = end-start+1;
				if(length < minlength) {
					minlength = length;
				}
				sum = sum - n[start];
				start++;
			}
		}
		System.out.println("Smallest window length = " +minlength);
	}
}
