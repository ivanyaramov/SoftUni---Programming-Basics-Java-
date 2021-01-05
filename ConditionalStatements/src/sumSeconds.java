import java.util.Scanner;

public class sumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int total = first + second + third;
        int a = total / 60;
        int b = total % 60;
        if (b < 10) {
            System.out.println(a + ":0" + b);
        }
        else{
            System.out.println(a+":"+b);
        }

    }

}
