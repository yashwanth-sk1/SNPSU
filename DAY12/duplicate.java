package DAY12;

public class duplicate {
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 1};

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    System.out.println("Duplicate number: " + nums[i]);
                }

            }
        }
    }
}