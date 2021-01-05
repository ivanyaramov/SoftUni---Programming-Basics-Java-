import java.util.Scanner;

public class leftAndRightSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int min=99999;
        int max=-99999;
        for(int i=0;i<n;i++){
            int a = Integer.parseInt(scanner.nextLine());
            if(a>max){
                max=a;
            }
            if(a<min){
                min=a;
            }
        }
        System.out.printf("Max number: %d",max);
        System.out.println();
        System.out.printf("Min number: %d",min);
    }
}
