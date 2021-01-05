import java.util.Scanner;

public class numberOperations{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();

        String oddoreven=" ";
        if(s.equals("+")){
            int f=a+b;
            if(f%2==0){
                oddoreven="even";
            }
            else{
                oddoreven="odd";
            }
            System.out.printf("%d + %d = %d - %s",a,b,f,oddoreven);
        }

        else if(s.equals("-")){
            int f=a-b;
            if(f%2==0){
                oddoreven="even";
            }
            else{
                oddoreven="odd";
            }
            System.out.printf("%d - %d = %d - %s",a,b,f,oddoreven);
        }

        else if(s.equals("*")){
            int f=a*b;
            if(f%2==0){
                oddoreven="even";
            }
            else{
                oddoreven="odd";
            }
            System.out.printf("%d * %d = %d - %s",a,b,f,oddoreven);
        }

        else if(s.equals("/")){
            double y=a;
            double f=y/b;
            if(b==0){
                System.out.printf("Cannot divide %d by zero",a);
            }
            else{
                System.out.printf("%d / %d = %.2f",a,b,f);
            }

        }

        else if(s.equals("%")){


            if(b==0){
                System.out.printf("Cannot divide %d by zero",a);
            }
            else{
                System.out.print(a);
                System.out.print(" % ");
                System.out.print(b);
                System.out.print(" = ");
                System.out.print(a%b);
            }

        }
    }
}
