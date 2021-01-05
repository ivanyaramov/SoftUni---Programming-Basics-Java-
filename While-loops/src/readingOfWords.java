import java.util.Scanner;

public class readingOfWords{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        while(!a.equals("Stop")){


            System.out.println(a);
             a = scanner.nextLine();
        }
    }
}
