import java.util.Scanner;

public class convertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        String b= scanner.nextLine();
        String c= scanner.nextLine();
        double d=0;
        if(b.equals("m") && c.equals("cm"))
        {
            d=a*100;
            System.out.printf("%.3f",d);
        }
        else if(b.equals("m")&& c.equals("mm"))
        {
            d=a*1000;
            System.out.printf("%.3f",d);
        }
        else if(b.equals("cm") && c.equals("mm"))
        {
            d=a*10;
            System.out.printf("%.3f",d);
        }
        else if(b.equals("cm") && c.equals("m"))
        {
            d=a/100;
            System.out.printf("%.3f",d);
        }
        else if(b.equals("mm") && c.equals("cm"))
        {
            d=a/10;
            System.out.printf("%.3f",d);
        }
        else if(b.equals("mm") && c.equals("m"))
        {d=a/1000;
            System.out.printf("%.3f",d);
        }
    }
}
