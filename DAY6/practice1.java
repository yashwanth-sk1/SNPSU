package DAY6;

public class practice1 {
	
	public static void main(String[] args) {
		int[] n = {10,20,30,40,50};
		int target = 70;
		int left = 0;
		int right = n.length - 1;
		while(left < right) {
			int sum = n[right] + n[left];
			if(sum == target) {
			System.out.println("Numbers Found : "+n[right]+" and " +n[left]);
			break;
			}
			else if(sum < target) {
				left ++;
			}
			else {
				right --;
			}
		}
	}
}
