import java.util.Scanner;

public class fruit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cenaq= Double.parseDouble(scanner.nextLine());
        double banan= Double.parseDouble(scanner.nextLine());
        double portokal= Double.parseDouble(scanner.nextLine());
        double malina= Double.parseDouble(scanner.nextLine());
        double qgoda= Double.parseDouble(scanner.nextLine());
        double cenam=cenaq/2;
        double cenap=0.6*cenam;
        double cenab=0.2*cenam;
        double sum= cenaq*qgoda + cenam*malina + cenap*portokal + cenab*banan;
        System.out.println(sum);
        System.out.println(cenaq*qgoda);
        System.out.println(cenam*malina);
        System.out.println(cenap*portokal);
        System.out.println(cenab*banan);
        System.out.printf("%.2f",sum);

    }
}