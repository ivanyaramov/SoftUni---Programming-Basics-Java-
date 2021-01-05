import java.util.Scanner;

public class SmallestNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max= Integer.MAX_VALUE;
        String s = scanner.nextLine();
        while(!s.equals("Stop")) {

            int a = Integer.parseInt(s);
            if (a <max) {
                max = a;
            }
            s = scanner.nextLine();

        }
        System.out.println(max);
    }
}
