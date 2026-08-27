package DAY7;

public class class107 {

    static int correctPin = 1234;

    static void checkPin(int pin) {

        System.out.println("Trying PIN: " + pin);

        if (pin == correctPin) {
            System.out.println("PIN correct. Access granted.");
            return;
        }

        System.out.println("Wrong PIN. Try again.");
    }

    public static void main(String[] args) {

        checkPin(1111);
        checkPin(2222);
        checkPin(3333);
        checkPin(1234);
    }
}