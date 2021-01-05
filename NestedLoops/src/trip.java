import java.util.Scanner;

public class trip{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int sum=0;
        while(!s.equals("End")){
            sum=0;
            double a = Double.parseDouble(scanner.nextLine());
            while(sum<a){
                double b = Double.parseDouble(scanner.nextLine());
                sum+=b;
            }
            System.out.printf("Going to %s!",s);
            System.out.println();
            s = scanner.nextLine();


        }

    }
}
