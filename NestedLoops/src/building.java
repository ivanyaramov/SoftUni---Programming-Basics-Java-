import java.util.Scanner;

public class building{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int etaji = Integer.parseInt(scanner.nextLine());
        int stai = Integer.parseInt(scanner.nextLine());
        for (int k =0 ; k < stai; k++) {
            System.out.printf("L%d%d ", etaji, k);
        }
        System.out.println();
        for (int i = etaji - 1; i >= 1; i--) {
            if (i % 2 == 1) {
                for (int k = 0; k < stai; k++) {
                    System.out.printf("A%d%d ", i, k);
                }
                System.out.println();

            } else {
                for (int k = 0; k < stai; k++) {
                    System.out.printf("O%d%d ", i, k);
                }
                System.out.println();

            }
        }
    }
}