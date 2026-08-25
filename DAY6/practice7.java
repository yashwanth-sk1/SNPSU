package DAY6;

public class practice7 {
	
	public static void main(String[] args) {
		
		int[] n = {2,3,1,2,4,3};
		int traget = 7;
		int minlength = n.length;
		
		for(int i=0; i<n.length; i++) {
			int sum = 0;
			for(int j=i; j<n.length; j++) {
				sum = sum + n[j];
				if(sum>= traget) {
					int length = j-i+1;
                    if (length < minlength) {
                        minlength = length;
                    }
                    break;
                }
            }
        }
        System.out.println("Smallest window length = " + minlength);
    }
}