import java.util.Scanner;

public class evenRoots{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int d=1;
        for(int i=0;i<=n;i++){
            if(i==0){
                System.out.println(1);
            }
            else if (i%2==0){
                d=d*4;
                System.out.println(d);
            }
        }

    }
}
