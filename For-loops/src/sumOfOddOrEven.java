import java.util.Scanner;

public class sumOfOddOrEven{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            int a = Integer.parseInt(scanner.nextLine());
            if(i%2==0){
                sum1=sum1+a;

            }
            else{
                sum2=sum2+a;
            }

        }
        if(sum1==sum2){
            System.out.println("Yes");
            System.out.printf("Sum = %d",sum1);
        }
        else{
            int y=Math.abs(sum1-sum2);
            System.out.println("No");
            System.out.printf("Diff = %d",y);
        }
    }
}
