import java.util.Scanner;

public class equalSUmOfEvenNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int d=0;
        int g=0;
        //a/100000 ;  a/10000%10 a/1000%10 a/100%10 a/10%10 a%10
        for (int i=a;i<=b;i++){


                d=i/100000+i/1000%10+i/10%10;


                g=i/10000%10+i/100%10+i%10;

            if(g==d){
                System.out.print(i+" ");
            }


        }
    }
}
