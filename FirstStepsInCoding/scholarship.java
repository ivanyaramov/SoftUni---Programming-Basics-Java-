import java.util.Scanner;

public class Nums1to10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dohod = Double.parseDouble(scanner.nextLine());
        double uspeh = Double.parseDouble(scanner.nextLine());
        double minz = Double.parseDouble(scanner.nextLine());
        double b=0;
        double c=0;
        if(uspeh>4.5 && dohod<minz){
             b=(35*minz)/100;
            //System.out.printf("You get a Social scholarship %.0f BGN",a);
        }
        if(uspeh>=5.5){
             c = uspeh*25;
            //System.out.printf("You get a scholarship for excellent results %.0f BGN",a);
        }


        if(uspeh<=4.5 && dohod<minz){
            System.out.println("You cannot get a scholarship!");
        }
        else if(c>=b){
            System.out.printf("You get a scholarship for excellent results %.0f BGN",b);
        }
        else{
            System.out.printf("You get a Social scholarship %.0f BGN",c);
        }



    }


}
