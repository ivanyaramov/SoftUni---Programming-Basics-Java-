import java.util.Scanner;

public class volleyball{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double sofiq = (48 - h) * 0.75 + 2.0 * p / 3;
        double selo = h;
        double obshto;
        if (a.equals("leap")) {
            obshto = (sofiq + selo) * 1.15;
        } else {
            obshto = sofiq + selo;}

            System.out.printf("%.0f", Math.floor(obshto));

    }
}
