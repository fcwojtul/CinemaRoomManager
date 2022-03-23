import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
            sum += array[i];
        }
        System.out.println(sum);
    }
}