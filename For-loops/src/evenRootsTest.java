import java.util.Scanner;

public class evenRootsTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(double i=0;i<=n;i++){
            if(i%2==0){
                double d=Math.pow(2,i);
                System.out.println(Math.round(d));
            }
        }

    }
}
