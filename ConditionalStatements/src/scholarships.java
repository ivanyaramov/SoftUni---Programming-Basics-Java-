import java.util.Scanner;

public class scholarships {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dohod = Double.parseDouble(scanner.nextLine());
        double uspeh = Double.parseDouble(scanner.nextLine());
        double minz = Double.parseDouble(scanner.nextLine());
        double a=0;
        double b=0;
        if (uspeh > 4.5 && dohod < minz) {
             a = 0.35*minz;
           // System.out.printf("You get a Social scholarship %.0f BGN", a);
        } if (uspeh >= 5.5) {
            b = uspeh * 25;
           // System.out.printf("You get a scholarship for excellent results %.0f BGN", a);
        }
            //System.out.println("You cannot get a scholarship!");
        if(a>b){
            double d=Math.floor(a);
            System.out.printf("You get a Social scholarship %.0f BGN", d);
        }
        else if(b>0 && b>=a){
            double d=Math.floor(b);
            System.out.printf("You get a scholarship for excellent results %.0f BGN", d);

        }
        if(a==0 && b==0){
            System.out.println("You cannot get a scholarship!");
        }
    }
}

