import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenAsc = 0;
        int maxAsc = 0;

        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }

        int previousValue = 0;
        for (int element: array) {
            if (lenAsc == 0) {
                previousValue = element;
            }

            if (previousValue <= element) {
                lenAsc++;
            }
            else {
                lenAsc = 1;
            }
            previousValue = element;
            maxAsc = lenAsc > maxAsc ? lenAsc : maxAsc;
        }
        System.out.println(maxAsc);
    }
}
