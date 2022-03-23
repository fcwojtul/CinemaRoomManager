import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }
        int number = scanner.nextInt(); // reading a length
        boolean returnValue = false;
        for (int element: array) {
            if (element == number) {
                returnValue = true;
            }
        }
        System.out.println(returnValue);
    }
}
