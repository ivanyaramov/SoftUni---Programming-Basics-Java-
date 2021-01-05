import java.util.Scanner;

public class comission{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());
        if (a.equals("Sofia")) {
            if (s <= 500 && s>=0 ) {
                System.out.printf("%.2f", (5 * s) / 100);
            } else if (s <= 1000 && s>=0) {
                System.out.printf("%.2f", (7 * s) / 100);
            } else if (s <= 10000 && s>=0) {
                System.out.printf("%.2f", (8 * s) / 100);
            } else if (s > 10000 && s>=0) {
                System.out.printf("%.2f", (12 * s) / 100);
            } else {
                System.out.println("error");

            }
        } else if (a.equals("Varna")) {
            if (s <= 500 && s>=0) {
                System.out.printf("%.2f", (4.5 * s) / 100);
            } else if (s <= 1000 && s>=0) {
                System.out.printf("%.2f", (7.5 * s) / 100);
            } else if (s <= 10000 && s>=0) {
                System.out.printf("%.2f", (10 * s) / 100);
            } else if (s > 10000 && s>=0) {
                System.out.printf("%.2f", (13 * s) / 100);
            } else {
                System.out.println("error");

            }
        }




            else if (a.equals("Plovdiv")) {
                if (s <= 500 && s>=0) {
                    System.out.printf("%.2f", (5.5 * s) / 100);
                } else if (s <= 1000 && s>=0) {
                    System.out.printf("%.2f", (8 * s) / 100);
                } else if (s <= 10000 && s>=0) {
                    System.out.printf("%.2f", (12 * s) / 100);
                } else if (s > 10000 && s>=0) {
                    System.out.printf("%.2f", (14.5 * s) / 100);
                } else {
                    System.out.println("error");

                }
            }



                else{
                    System.out.println("error");

                }



        }
    }
