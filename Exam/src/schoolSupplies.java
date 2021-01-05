import java.util.Scanner;

public class schoolSupplies{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        int procent = Integer.parseInt(scanner.nextLine());
        double himikal= 5.8*a;
        double markeri=7.2*b;
        double preparat=1.2*c;
        double obshto=(100-procent)*(himikal+markeri+preparat)/100;
        System.out.printf("%.3f",obshto);

    }
}
