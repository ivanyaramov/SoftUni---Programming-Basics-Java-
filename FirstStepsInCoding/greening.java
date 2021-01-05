import java.util.Scanner;
public class greening{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a= Double.parseDouble(scanner.nextLine());
        double b= a*7.61;
        double disc= b*18/100;
        double kr= b - disc;
        System.out.println("The final price is: "+kr);
        System.out.println("The discount is: "+disc);
    }
}
