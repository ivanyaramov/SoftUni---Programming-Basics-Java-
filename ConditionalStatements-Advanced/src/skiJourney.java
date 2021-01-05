import java.util.Scanner;

public class skiJourney{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String b = scanner.nextLine();
        String c = scanner.nextLine();
        double d=0;
        if(b.equals("room for one person")){
            d=18*(a-1);
        }
        else if(b.equals("apartment")){
            d=25*(a-1);
            if(a<10){
                d=d*0.7;
            }
            else if(a>=10 && a<15){
                d=d*0.65;
            }
            else if(a>=15){
                d=d*0.5;
            }
        }

        else if(b.equals("president apartment")){
            d=35*(a-1);
            if(a<10){
                d=d*0.9;
            }
            else if(a>=10 && a<15){
                d=d*0.85;
            }
            else if(a>=15){
                d=d*0.8;
            }
        }

        if(c.equals("positive")){
            d=d*1.25;
        }
        else if(c.equals("negative")){
            d=d*0.9;
        }
        System.out.printf("%.2f",d);



    }
}
