import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numbers = new int[len];

        for (int i = 0; i < len; i++) {
            numbers[i] = scanner.nextInt();
        }
        boolean returnValue = true;
        for (int i = 1; i < len; i++) {
            if (numbers[i] < numbers[i - 1]) {
                returnValue = false;
                break;
            }
        }
        System.out.println(returnValue);
    }
}
