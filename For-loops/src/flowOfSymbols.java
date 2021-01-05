import java.util.Scanner;

public class flowOfSymbols{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        for(int i=0;i<a.length();i++){
            char b=a.charAt(i);
            System.out.println(b);
        }
    }
}
