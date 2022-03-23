import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        char myChar = Character.toLowerCase(ch);
        if (myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u') {
            return true;
        }
        else {
            return false;
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}