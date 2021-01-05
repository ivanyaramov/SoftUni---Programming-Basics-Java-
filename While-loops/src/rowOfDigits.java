import java.util.Scanner;

public class rowOfDigits{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = 1;
        while(b<=a){
            System.out.println(b);
            b=2*b+1;
        }
    }
}
