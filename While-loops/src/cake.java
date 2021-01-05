import java.util.Scanner;

public class cake{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int obshto=a*b;
        int sum=0;
        int g=0;
        String s = scanner.nextLine();
        while(true){
            if(s.equals("STOP")){
                System.out.printf("%d pieces are left.",obshto-sum);
                break;
            }
             g = Integer.parseInt(s);
            sum+=g;
            if(sum>=obshto){
                int f=sum-obshto;
                System.out.printf("No more cake left! You need %d pieces more.",f);
                break;
            }
            s = scanner.nextLine();

        }
    }
}
