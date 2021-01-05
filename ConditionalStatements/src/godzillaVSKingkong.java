import java.util.Scanner;

public class godzillaVSKingkong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double dekor=a*0.1;
        double cena=b*c;

        if(b>150)
        {
            cena=0.9*cena;
        }
        if(dekor+cena>a)
        {double f=(dekor+cena)-a;
            System.out.println("Not enough money!");
                    System.out.print("Wingard needs ");
                    System.out.printf("%.2f",f);
                    System.out.print(" leva more.");

        }
        else{
            double f=a-(dekor+cena);
            System.out.println("Action!");
            System.out.print("Wingard starts filming with ");
            System.out.printf("%.2f",f);
            System.out.print(" leva left.");

        }
    }
}
