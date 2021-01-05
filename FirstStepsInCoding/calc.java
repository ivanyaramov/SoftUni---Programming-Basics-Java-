import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a= Double.parseDouble(scanner.nextLine());
        int c= Integer.parseInt(scanner.nextLine());
        double b= Double.parseDouble(scanner.nextLine());
        double f=(a*b/100)/12;
        System.out.println(a+c*f);
    }
}
