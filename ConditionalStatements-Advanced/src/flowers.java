import java.util.Scanner;

public class flowers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double d=0;
        if(a.equals("Roses")){
            if(b>80){
                d=(b*5)*0.9;
            }
            else{
                d=b*5;
            }

        }
        else if(a.equals("Dahlias")){
            if(b>90){
                d=(b*3.8)*0.85;
            }
            else{
                d=b*3.8;
            }

        }
        else if(a.equals("Tulips")){
            if(b>80){
                d=(b*2.8)*0.85;
            }
            else{
                d=b*2.8;
            }

        }
        else if(a.equals("Narcissus")){
            if(b<120){
                d=(b*3)*1.15;
            }
            else{
                d=b*3;
            }

        }
        else if(a.equals("Gladiolus")){
            if(b<80){
                d=(b*2.5)*1.2;
            }
            else{
                d=b*2.5;
            }

        }

        if(d<=c){
            double j=c-d;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",b,a,j);
        }
        else{
            double j=d-c;
            System.out.printf("Not enough money, you need %.2f leva more.",j);
        }

    }
}
