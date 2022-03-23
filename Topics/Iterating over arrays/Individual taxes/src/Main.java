import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] companies = new int[len];
        int[] taxes = new int[len];

        int maxTaxes = -1;
        int companyID = 0;

        for (int i = 0; i < len; i++) {
            companies[i] = scanner.nextInt();
        }
        for (int i = 0; i < len; i++) {
            taxes[i] = scanner.nextInt();
        }

        for (int i = 0; i < len; i++) {
            if (taxes[i]*companies[i] > maxTaxes) {
                maxTaxes = taxes[i] * companies[i];
                companyID = i+1;
            }
        }
        System.out.println(companyID);
    }
}