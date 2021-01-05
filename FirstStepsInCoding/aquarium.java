import java.util.Scanner;

public class aquarium{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double procent= Double.parseDouble(scanner.nextLine());
        double procent1= 100-procent;
        int obem= a*b*c;
        double vmestimost= (procent1/100)*obem;
        double realno = vmestimost/1000;
        System.out.printf("%.2f",realno);
    }
}
