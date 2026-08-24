package DAY4;

public class optimization {
    public static void main(String[] args) {

        int n = 1000;
        int[] students = new int[n];

        for (int i = 0; i < n; i++) {
            students[i] = i + 1;
        }

        int target = 1000;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (students[i] == target) {
                found = true;
                break;
            }
        }

        System.out.println("student found: " + found);
    }
}