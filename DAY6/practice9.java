package DAY6;

public class practice9 {
	public static void main(String[] args) {
		int[] marks = {80,85,45,90,95};
		int max = 0;
		for(int i=0; i<marks.length; i++) {
			for(int j=1 ;j<marks.length; j++) {
				if(marks[i]>marks[j]) {
					max = marks[i];
				} else {
					max = marks[j];
					
				}
			}
		}
		System.out.println("Maximum marks : " +max);
	}
}
