package DAY7;
import java.util.Arrays;

public class class109 {

    public static int binarysearch(String[] arr, String target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            System.out.println("Checking: " + arr[mid]);

            if (arr[mid].equals(target)) {
                return mid;

            } else if (target.compareTo(arr[mid]) > 0) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String[] names = {
            "Arun",
            "Yashwanth",
            "Bharath",
            "Chandru",
            "Kiran",
            "Manoj",
            "Pavan",
            "Rahul",
            "Ravi",
            "Suresh",
        };
        Arrays.sort(names);
        System.out.println("Sorted names: \n\n"+Arrays.toString(names)+ "\n");

        String target = "Yashwanth";

        int result = binarysearch(names, target);

        if (result != -1) {
            System.out.println("Name found at index: " + result);
        } else {
            System.out.println("Name not found");
        }
    }
}