import java.text.DecimalFormat;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double square = 0;
        switch (scanner.nextLine()) {
            case "triangle":
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();
                double p = (a + b + c) / 2;
                square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                break;
            case "rectangle":
                square = scanner.nextDouble() * scanner.nextDouble();
                break;
            case "circle":
                DecimalFormat df = new DecimalFormat("#.##");
                Double myPI = Double.valueOf(df.format(Math.PI));
                square = Math.pow(scanner.nextDouble(), 2) * myPI;
                break;
            default:
                break;
        }
        System.out.println(square);
    }
}