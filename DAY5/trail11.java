package DAY5;
import java.util.HashSet;

public class trail11 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C");

        for (String x : set) {
            System.out.println(x);
        }
    }
}