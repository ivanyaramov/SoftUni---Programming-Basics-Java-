import java.util.Scanner;

public class sweetshop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        int e = Integer.parseInt(scanner.nextLine());
        int c1=c*45;
        double d1=d*5.8;
        double e1=e*3.2;
        double sum=(c1+d1+e1)*b;
        double sum1=sum*a;
        double sum2=sum1-sum1/8;
        System.out.printf("%.2f",sum2);

    }
}