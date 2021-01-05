import java.util.Scanner;

public class USDTOBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a= Double.parseDouble(scanner.nextLine());
        double b= a*1.79549;
        System.out.printf("%.2f", b);
    }
}
