import java.util.Scanner;

public class aquapark{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mesec = scanner.nextLine();
        double chasove = Double.parseDouble(scanner.nextLine());
        double hora = Double.parseDouble(scanner.nextLine());
        String vreme = scanner.nextLine();
        double cena=0;
        if(mesec.equals("march")||mesec.equals("april")||mesec.equals("may")){
            if(vreme.equals("day")){
                cena=10.5;
            }
            else if(vreme.equals("night")){
                cena=8.4;
            }
        }

        else if(mesec.equals("june")||mesec.equals("july")||mesec.equals("august")){
            if(vreme.equals("day")){
                cena=12.6;
            }
            else if(vreme.equals("night")){
                cena=10.2;
            }
        }

        if(hora>=4){
            cena=0.9*cena;
        }
        if(chasove>=5){
            cena=0.5*cena;
        }
        int a=5;
        double b=6.3;
        double c=a*b;
        double obshto=cena*hora*chasove;
        System.out.printf("Price per person for one hour: %.2f",cena);
        System.out.println();
        System.out.printf("Total cost of the visit: %.2f",obshto);
    }
}
