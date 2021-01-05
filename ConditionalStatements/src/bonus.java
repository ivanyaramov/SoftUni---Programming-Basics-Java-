import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        double b=0;
        int c;
        if (a<=100)
        {
            b=5;
        }
        else if (a>100 && a<=1000)
        {
            b=a/5.0;
        }
        else if(a>1000)
        {
            b=a/10.0;
        }
        if(a%2==0)
        {
            b=b+1;
        }
        else if(a%5==0 && a%2==1)
        {
            b=b+2;
        }
        System.out.println(b);
        System.out.println(a+b);


    }
}
