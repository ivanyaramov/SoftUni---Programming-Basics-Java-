import java.util.Scanner;

public class birthday{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = Integer.parseInt(scanner.nextLine());
        double b = 20*a/100;
        double c=b*55/100;
        double d=a/3;
        System.out.println(a+b+c+d);
    }
}
