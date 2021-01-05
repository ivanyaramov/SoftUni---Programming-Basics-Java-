import java.util.Scanner;

public class sumOfPrimeAndNotPrimeNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s =" ";
        int a=0;
        int br=0;
        int prime=0;
        int nonprime=0;
        while(true){
            s = scanner.nextLine();
            if(s.equals("stop")){
                break;
            }
            else{
                 a = Integer.parseInt(s);
            }
         if(a<0){
             System.out.println("Number is negative.");
         }
         else if(a>1) {
             for (int i = 1; i <= a; i++) {
                 if (a % i == 0) {
                     br++;
                 }
             }
         }
         if(br>2){
             nonprime+=a;
         }
         else if(br==1 || br==2){
             prime+=a;
         }
         br=0;


        }
        System.out.printf("Sum of all prime numbers is: %d",prime);
        System.out.println();
        System.out.printf("Sum of all non prime numbers is: %d",nonprime);
    }
}
