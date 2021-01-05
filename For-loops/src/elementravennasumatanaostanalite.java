import java.util.Scanner;

public class elementravennasumatanaostanalite{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max=-99999;
        int sum=0;
        for(int i=0;i<n;i++){
            int a = Integer.parseInt(scanner.nextLine());
            if (a>max){
                max=a;
            }
            sum=sum+a;
        }
        if(sum-max==max){
            System.out.println("Yes");
            System.out.printf("Sum = %d",max);
        }
        else{
            int y=Math.abs((sum-max)-max);
            System.out.println("No");
            System.out.printf("Diff = %d",y);
        }
    }
}
