import java.util.Scanner;

public class record {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double c = Double.parseDouble(scanner.nextLine());

            double d=b/15;
            double j=Math.floor(d);
            double f=b*c+12.5*j; //vreme cqlo razstoqnie
            if(f>=a) {

                double q = f - a;
                System.out.print("No, he failed! He was ");
                System.out.printf("%.2f",q );
                System.out.print(" seconds slower.");
            }
            else {


                System.out.print("Yes, he succeeded! The new world record is ");
                System.out.printf("%.2f",f );
                System.out.print(" seconds.");
            }

            }


    }


