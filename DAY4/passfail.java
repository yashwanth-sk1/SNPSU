package DAY4;
public class passfail {
    public static void main(String[] args) {
        int[] marks = {35, 67, 89, 22, 45, 30, 76};
        int count = 0;
        for (int m : marks) if (m >= 40) count++;
        System.out.println("Passed: " + count);
    }
}
