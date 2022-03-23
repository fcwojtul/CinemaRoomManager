package cinema;

import java.util.Scanner;

public class Menu {

    public static void show(){
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
    }
    public static int choose(){
        return new Scanner(System.in).nextInt();
    }
}
