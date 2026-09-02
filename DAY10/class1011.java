package DAY10;

public class class1011 {
    static class Meeting {
        String name;
        int start;
        int end;

        Meeting(String name, int start, int end) {
            this.name = name;
            this.start = start;
            this.end = end;
        }
    }

    static void merge(Meeting[] a, int left, int mid, int right) {

        Meeting[] temp = new Meeting[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (a[i].start <= a[j].start) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= right) {
            temp[k++] = a[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            a[i] = temp[k];
        }
    }

    static void mergeSort(Meeting[] a, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    static void mergeCollisions(Meeting[] meetings) {

        int index = 0;

        for (int i = 1; i < meetings.length; i++) {

            if (meetings[index].end >= meetings[i].start) {

                if (meetings[i].end > meetings[index].end) {
                    meetings[index].end = meetings[i].end;
                }

                meetings[index].name =
                        meetings[index].name + "+" + meetings[i].name;

            } else {

                index++;
                meetings[index] = meetings[i];
            }
        }

        System.out.println("Meetings after internal merging:");

        for (int i = 0; i <= index; i++) {

            System.out.println(
                    meetings[i].name +
                    " : Start = " + formatTime(meetings[i].start) +
                    ", End = " + formatTime(meetings[i].end)
            );
        }
    }

    static String formatTime(int time) {

        int hour = time / 100;
        int minute = time % 100;

        String period;

        if (hour >= 12) {
            period = "PM";
        } else {
            period = "AM";
        }

        if (hour > 12) {
            hour = hour - 12;
        }

        if (hour == 0) {
            hour = 12;
        }

        return String.format("%02d:%02d %s", hour, minute, period);
    }

    public static void main(String[] args) {

        Meeting[] meetings = {

            new Meeting("A", 900, 1000),
            new Meeting("B", 900, 1100),
            new Meeting("C", 1000, 1100),
            new Meeting("D", 1100, 1200),
            new Meeting("E", 1130, 1300)
        };

        mergeSort(meetings, 0, meetings.length - 1);
        mergeCollisions(meetings);
    }
}