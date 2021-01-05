import java.util.Scanner;

public class cardBalance{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b=0;
        String s = scanner.nextLine();
        while(!s.equals("NoMoreMoney")){
            double a = Double.parseDouble(s);
            if(a>=0){
                System.out.printf("Increase: %.2f",a);
                System.out.println();
                b+=a;
            }
            else{
                System.out.println("Invalid operation!");
                break;
            }
            s = scanner.nextLine();
        }
        System.out.printf("Total: %.2f",b);
    }
}
