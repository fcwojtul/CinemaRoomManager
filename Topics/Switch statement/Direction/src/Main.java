import java.util.Scanner;

class Main {
    public static final int UP = 1;
    public static final int DOWN = 2;
    public static final int LEFT = 3;
    public static final int RIGHT = 4;
    public static final int NOT_MOVE = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String direction = "move ";
        switch (scanner.nextInt()) {
            case UP:
                direction += "up";
                break;
            case DOWN:
                direction += "down";
                break;
            case LEFT:
                direction += "left";
                break;
            case RIGHT:
                direction += "right";
                break;
            case NOT_MOVE:
                direction = "do not move";
                break;
            default:
                direction = "error!";
                break;
        }
        System.out.println(direction);
    }
}