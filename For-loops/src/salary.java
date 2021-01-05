import java.util.Scanner;

public class salary{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int sum=0;
        for(int i=1;i<=n;i++){
            String s = scanner.nextLine();
            if(s.equals("Facebook")){
                sum=sum+150;
            }
            if(s.equals("Instagram")){
                sum=sum+100;
            }
            if(s.equals("Reddit")){
                sum=sum+50;
            }
        }
           if(sum>=salary){
               System.out.println("You have lost your salary.");
           }
           else{
               int d=salary-sum;
               System.out.println(d);
           }
    }
}
