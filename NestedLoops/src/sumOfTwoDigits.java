import java.util.Scanner;

public class sumOfTwoDigits{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int br=0;
        boolean s=false;
        for(int i=a;i<=b;i++){
            for(int k=a;k<=b;k++){
                br++;
                if(i+k==c){
                    System.out.printf("Combination N:%d (%d + %d = %d)",br,i,k,c);
                    s=true;
                    break;
                }

            }
            if(s){
                break;
            }
        }
        if(!s){
            System.out.printf("%d combinations - neither equals %d",br,c);
        }
    }
}
