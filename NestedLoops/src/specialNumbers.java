import java.util.Scanner;

public class specialNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int br=0;
        for(int i=1111;i<=9999;i++){
            int a=i/1000;
            int b=i/100%10;
            int c=i/10%10;
            int d=i%10;
            if(a>0 && b>0 && c>0 && d>0 && n%a==0 && n%b==0 && n%c==0 && n%d==0){
                System.out.print(i+" ");
            }

        }
    }
}
