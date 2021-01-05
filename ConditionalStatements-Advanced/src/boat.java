import java.util.Scanner;

public class boat{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String b = scanner.nextLine();
        int c = Integer.parseInt(scanner.nextLine());
        double d=0;
        double f=0;
       if(b.equals("Spring")){
           d=3000;
           if(c<=6){
               f=10;
           }
           else if(c<=11){
               f=15;
           }
           else  {
               f=25;
           }
           if(c%2==0){
               f=100-(100-f)*0.95;
           }
       }


        else if(b.equals("Summer")){
            d=4200;
            if(c<=6){
                f=10;
            }
            else if(c<=11){
                f=15;
            }
            else  {
                f=25;
            }
            if(c%2==0){
                f=100-(100-f)*0.95;
            }
        }



        else if(b.equals("Autumn")){
            d=4200;
            if(c<=6){
                f=10;
            }
            else if(c<=11 ){
                f=15;
            }
            else
           {
                f=25;
            }

        }

        else if(b.equals("Winter")){
            d=2600;
            if(c<=6){
                f=10;
            }
            else if(c<=11){
                f=15;
            }
            else  {
                f=25;
            }
            if(c%2==0 ){
                f=100-(100-f)*0.95;
            }
        }

        d=((100-f)*d)/100;

        if(a>=d){
            double g=a-d;
            System.out.printf("Yes! You have %.2f leva left.",g);
        }
        else{
            double g=d-a;
            System.out.printf("Not enough money! You need %.2f leva.",g);
        }

    }
}
