import java.util.Scanner;

public class childrenToys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a=Double.parseDouble(scanner.nextLine());
        int brp= Integer.parseInt(scanner.nextLine());
        int brgk= Integer.parseInt(scanner.nextLine());
        int brpm= Integer.parseInt(scanner.nextLine());
        int brm= Integer.parseInt(scanner.nextLine());
        int brka= Integer.parseInt(scanner.nextLine());
        double cp=2.6*brp;
        double cgk=3*brgk;
        double cpm=4.1*brpm;
        double cm=8.2*brm;
        double cka=2*brka;
        int br= brp+brgk+brpm+brm+brka;
        double cena = cp+cgk+cpm+cm+cka;
        if(br>=50)
        {
            cena=(3*cena)/4;
        }
        double cena1 = (9*cena)/10;
        if(cena1>=a)
        {double x=cena1-a;
            System.out.print("Yes! ");
            System.out.printf("%.2f",x);
            System.out.print(" lv left.");
        }
        else{
            double y = a-cena1;
            System.out.print("Not enough money! ");
            System.out.printf("%.2f",y);
            System.out.print(" lv needed.");
        }
//        Пъзел - 2.60 лв.
// Говореща кукла - 3 лв.
// Плюшено мече - 4.10 лв.
// Миньон - 8.20 лв.
// Камионче - 2 лв.

    }
}
