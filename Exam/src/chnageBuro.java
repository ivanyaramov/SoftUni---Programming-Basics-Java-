import java.util.Scanner;

public class chnageBuro{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double evro= ((1168*a)/1.95)+(b*0.15)*1.76/1.95;
        double evro2= (100-c)*evro/100;
        System.out.printf("%.2f",evro2);
    }
}
