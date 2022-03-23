package cinema;


public class Hall {
    private final int rows;
    private final int seats;
    private final String[][] hall;
    private static final String freeSeat = "S";
    private static final String takenSeat = "B";

    public Hall(int rows, int seats) {
        this.rows = rows;
        this.seats = seats;
        this.hall = new String[rows][seats];
        fill();
    }


    public int getRows() {
        return rows;
    }

    public int getSeats() {
        return seats;
    }

    private void fill(){
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.seats; j++) {
                hall[i][j] = freeSeat;
            }
        }
    }
    public void draw(){
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 0; i < getSeats(); i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < getRows(); i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < getSeats(); j++) {
                System.out.print(this.hall[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void bookPlace(int row, int seat) {
        hall[row-1][seat-1] = takenSeat;
    }

    public boolean isFreeSeat(int row, int seat){
        return freeSeat.equals(hall[row-1][seat-1]);
    }

    public int ticketPrice(int row) {
        return ((rows * seats >= 60) && (row > (rows/2))) ? 8 : 10;
    }

    public void showStatistics(){
        int purchasedTickets = 0;
        int currentIncome = 0;
        int totalIncome = 0;
        double percentage;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                purchasedTickets += hall[i][j].equals(takenSeat) ? 1 : 0;
                currentIncome += hall[i][j].equals(takenSeat) ? ticketPrice(i+1) : 0;
                totalIncome += ticketPrice(i+1);
            }
        }

        percentage = (double) purchasedTickets * 100 / (double) (rows * seats);

        System.out.println("Number of purchased tickets: " + purchasedTickets);
        System.out.printf("Percentage: %.2f%s", percentage, "%");
        System.out.println();
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncome);
        System.out.println();
    }
}
