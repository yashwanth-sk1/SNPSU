package DAY5;

public class trail7 {
    public static void main(String[] args) {

        String word = "programming";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            for (int j = i + 1; j < word.length(); j++) {

                if (word.charAt(i) == word.charAt(j)) {
                    System.out.println(word.charAt(i));
                    count ++;
                    break;
                }
            }
        }
        System.out.println("Duplicates : "+count);
    }
}