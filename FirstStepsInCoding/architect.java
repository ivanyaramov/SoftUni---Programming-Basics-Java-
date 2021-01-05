import java.util.Scanner;

public class architect{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname= scanner.nextLine();
        int br= Integer.parseInt(scanner.nextLine());
        int a=br*3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s. ", firstname, a, br);

    }
}
