import java.util.Scanner;

public class Nums1to10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a= Double.parseDouble(scanner.nextLine());
        double b= a*180/Math.PI;
        System.out.printf("%.0f", b);
    }
}
