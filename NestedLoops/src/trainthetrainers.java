import java.util.Scanner;

public class trainthetrainers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        double sum=0;
        double sum1=0;
        int br=0;
        while(true){
            if(s.equals("Finish")){
                break;
            }
            for(int i=1;i<=a;i++){
                double b = Double.parseDouble(scanner.nextLine());
                sum+=b;
                sum1+=b;
            }
            br++;
            double rezultat=sum/a;
            sum=0;
            System.out.print(s);
            System.out.print(" - ");
            System.out.printf("%.2f.",rezultat);
            System.out.println();
            s = scanner.nextLine();


        }
        double obshto=sum1/(br*a);
        System.out.printf("Student's final assessment is %.2f.",obshto);
    }
}
