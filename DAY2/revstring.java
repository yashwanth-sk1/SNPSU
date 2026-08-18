package DAY2;

public class revstring {
    public static void main(String[] args) {
        String str = "Yashwanth";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Original String: " + str);
        System.out.println("Reverse String: " + reverse);
    }
}