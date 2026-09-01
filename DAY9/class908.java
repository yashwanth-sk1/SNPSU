package DAY9;

public class class908 {

    public static void main(String[] args) {

        long[] mobile = {
            6362086131L,
            9876543210L,
            123456789L
        };

        for (long number : mobile) {

            String str = String.valueOf(number);

            if (str.length() == 10 && str.charAt(0) >= '6' && str.charAt(0) <= '9') {
                System.out.println(number + " is a valid mobile number");
            } else {
                System.out.println(number + " is an invalid mobile number");
            }
        }
    }
}