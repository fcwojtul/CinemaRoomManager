package cinema;

public class Ticket {
    private final int price;

    public Ticket(Hall hall, int row, int seat) {
        this.price = hall.ticketPrice(row);
        hall.bookPlace(row, seat);
    }

    public int getPrice() {
        return price;
    }
}
