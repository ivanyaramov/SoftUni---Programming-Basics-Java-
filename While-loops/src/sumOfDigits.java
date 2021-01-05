import java.util.Scanner;

public class sumOfDigits{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        while(b<a){
             int c = Integer.parseInt(scanner.nextLine());
             b+=c;
        }
        System.out.println(b);
    }
}
