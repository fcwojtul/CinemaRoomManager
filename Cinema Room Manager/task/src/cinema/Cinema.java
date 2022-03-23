package cinema;

import java.util.Scanner;

public class Cinema {

    private static boolean validateNumber(String number1, String number2) {
        return (!(number1.matches("\\d+") && number2.matches("\\d+")));
    }

    private static Hall getCinemaSizeFromUser(){
        boolean dataValidator = false;
        String rows = "0";
        String seats = "0";
        while (!dataValidator) {
            System.out.println("Enter the number of rows:");
            rows = new Scanner(System.in).nextLine();

            System.out.println("Enter the number of seats in each row:");
            seats = new Scanner(System.in).nextLine();

            if (validateNumber(rows, seats)) {
                System.out.println("Wrong input!");
            }
            else {
                dataValidator = true;
            }
        }
        return new Hall(Integer.parseInt(rows), Integer.parseInt(seats));
    }

    private static void buyTicket(Hall hall){
        boolean dataValidator = false;
        String rowNumber = "0";
        String seatNumber = "0";
        while (!dataValidator) {
            System.out.println("Enter a row number:");
            rowNumber = new Scanner(System.in).nextLine();
            System.out.println("Enter a seat number in that row:");
            seatNumber = new Scanner(System.in).nextLine();

            if (validateNumber(rowNumber, seatNumber) ||
                Integer.parseInt(rowNumber) > hall.getRows() ||
                Integer.parseInt(seatNumber) > hall.getSeats()) {
                System.out.println("Wrong input!");
            }
            else if (!hall.isFreeSeat(Integer.parseInt(rowNumber), Integer.parseInt(seatNumber))) {
                System.out.println("That ticket has already been purchased!");
            }
            else {
                dataValidator = true;
            }
        }

        Ticket ticket = new Ticket(hall, Integer.parseInt(rowNumber), Integer.parseInt(seatNumber));
        System.out.println("Ticket price: $"+ticket.getPrice());
        System.out.println();
    }

    public static void main(String[] args) {
        int choose = 1;
        Hall hall = getCinemaSizeFromUser();
        while (choose != 0) {
            Menu.show();
            choose = Menu.choose();
            switch (choose){
                case 1:
                    hall.draw();
                    break;
                case 2:
                    buyTicket(hall);
                    break;
                case 3:
                    hall.showStatistics();
                    break;
                default:
                    choose = 0;
                    break;
            }
        }
    }
}