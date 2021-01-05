import java.util.Scanner;

public class PCStore{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double procesor = Double.parseDouble(scanner.nextLine());
        double vkarta = Double.parseDouble(scanner.nextLine());
        double ram = Double.parseDouble(scanner.nextLine());
        int rambr = Integer.parseInt(scanner.nextLine());
        double otstupka = Double.parseDouble(scanner.nextLine());
        double obshto=(procesor+vkarta)*(1-otstupka)+ram*rambr;
        double leva=obshto*1.57;
        System.out.printf("Money needed - %.2f leva.",leva);


    }
}
