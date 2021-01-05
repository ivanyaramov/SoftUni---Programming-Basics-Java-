import java.util.Scanner;

public class biggestNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max= Integer.MIN_VALUE;
        String s = scanner.nextLine();
        while(!s.equals("Stop")) {

            int a = Integer.parseInt(s);
            if (a > max) {
                max = a;
            }
            s = scanner.nextLine();

        }
        System.out.println(max);
    }
}
