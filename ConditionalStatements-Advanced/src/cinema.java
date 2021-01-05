import java.util.Scanner;

public class cinema{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int r=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());
        double d=c*r;
        if(a.equals("Premiere"))
        {
            System.out.printf("%.2f",d*12);
            System.out.print(" leva.");
        }
        else if(a.equals("Normal"))
        {
            System.out.printf("%.2f",d*7.5);
            System.out.print(" leva.");
        }
        else if(a.equals("Discount"))
        {
            System.out.printf("%.2f",d*5);
            System.out.print(" leva.");
        }
    }
}
