package DAY6;

public class practice4 {
    public static void main(String[] args) {

        int[] n = {10, 20, 30, 40, 50};
        int windowSize = 3;

        for (int i = 0; i <= n.length - windowSize; i++) {
            int sum = 0;
            for (int j = i; j < i + windowSize; j++) {
                sum = sum + n[j];
            }
            System.out.println("Sum = " + sum);
        }
    }
}