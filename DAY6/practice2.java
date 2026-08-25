package DAY6;

public class practice2 {
	
	public static void main(String[] args) {
		int[] n = {10,20,30,40,50};
		int marks = 80;
		int left = 0;
		int right = n.length - 1;
		while(left < right) {
			int sum = n[right] + n[left];
			if(sum == marks) {
			System.out.println("Numbers Found : "+n[right]+" and " +n[left]);
			break;
			}
			else if(sum < marks) {
				left ++;
			}
			else {
				right --;
			}
		}
	}
}
