import java.util.Scanner;

public class pyramidsOfNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int b=0;
        for(int i=1;i<=n;i++){
            for (int k=1;k<=i;k++){
                b++;
                System.out.print(b + " ");
                if(b>=n){
                    break;
                }


            }
            if(b>=n){
                break;
            }
            System.out.println();

        }

    }
}
