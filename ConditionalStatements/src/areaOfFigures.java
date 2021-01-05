import java.util.Scanner;

public class areaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figura= scanner.nextLine();

        if(figura.equals("square"))
        {

            double a= Double.parseDouble(scanner.nextLine());
            double lice=a*a;
            System.out.printf("%.3f",lice);

        }
        else if(figura.equals("rectangle"))
        {
            double a= Double.parseDouble(scanner.nextLine());
            double b= Double.parseDouble(scanner.nextLine());
            double lice=a*b;
            System.out.printf("%.3f",lice);
        }
        else if(figura.equals("circle"))
        {
            double a= Double.parseDouble(scanner.nextLine());
            double lice=a*a*Math.PI;
            System.out.printf("%.3f",lice);
        }
        else if(figura.equals("triangle"))
        {
            double a= Double.parseDouble(scanner.nextLine());
            double h= Double.parseDouble(scanner.nextLine());
            double lice=a*h/2;
            System.out.printf("%.3f",lice);
        }


    }
}
