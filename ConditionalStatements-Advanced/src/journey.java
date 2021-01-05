import java.util.Scanner;

public class journey{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a= Double.parseDouble(scanner.nextLine());
        String s = scanner.nextLine();
        double suma=0;
        String v=" ";
        String x=" ";
        if(a<=100){
            v="Somewhere in Bulgaria";

            if(s.equals("summer")){
                suma=(30*a)/100;
                x="Camp";
            }
            else if(s.equals("winter")){
                suma=(70*a)/100;
                x="Hotel";
            }
        }

        else if(a<=1000){
            v="Somewhere in Balkans";
            if(s.equals("summer")){
                x="Camp";
                suma=(40*a)/100;
            }
            else if(s.equals("winter")){
                suma=(80*a)/100;
                x="Hotel";
            }
        }

        else {
            v="Somewhere in Europe";
            if(s.equals("summer")){
                suma=(90*a)/100;
                x="Hotel";
            }
            else if(s.equals("winter")){
                suma=(90*a)/100;
                x="Hotel";
            }
        }

        System.out.println(v);
        System.out.printf(x+" - %.2f",suma);

    }
}
