package DAY10;

public class class1010 {

    public static void main(String[] args) {

        String[] movie = {"Movie A", "Movie B", "Movie C", "Movie D", "Movie E"};

        int[] start = {900, 930, 1100, 1200, 1330};
        int[] end = {1030, 1100, 1200, 1300, 1500};

        int lastEnd = end[0];

        System.out.println("Selected Movie: " + movie[0]);
        System.out.println("Start: " + start[0]);
        System.out.println("End: " + end[0]);

        for (int i = 1; i < start.length; i++) {

            if (start[i] >= lastEnd) {

                System.out.println("\nSelected Movie: " + movie[i]);
                System.out.println("Start: " + start[i]);
                System.out.println("End: " + end[i]);

                lastEnd = end[i];
            }
        }
    }
}