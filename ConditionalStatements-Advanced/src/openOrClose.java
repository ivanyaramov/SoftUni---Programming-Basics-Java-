import java.util.Scanner;

public class openOrClose{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        String b = scanner.nextLine();
        if(a>=10 && a<=18 && (b.equals("Monday") || b.equals("Tuesday") || b.equals("Friday") || b.equals("Wednesday") || b.equals("Thursday") || b.equals("Saturday")) ){
            System.out.println("open");
        }
        else{
            System.out.println("closed");
        }
    }
}
