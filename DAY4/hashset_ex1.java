package DAY4;

import java.util.HashSet;

public class hashset_ex1 {

    public static void main(String[] args) {

        int[] no = {10, 20, 30, 20, 40};

        HashSet<Integer> set = new HashSet<>();

        for (int number : no) {

            if (set.contains(number)) {
                System.out.println("duplicate " + number);
            } else {
                set.add(number);
            }
        }
    }
}