import java.sql.SQLOutput;
import java.util.Scanner;

public class hotelRoom{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int studioprocent=100;
        int apartmentprocent=100;
        double apartment=0;
        double studio=0;
        if(s.equals("May") || s.equals("October")){
            if(a>7 && a<=14){
                studioprocent=95;
            }
            else if(a>14){
                studioprocent=70;
            }
            double g=a*50;
            studio=(g*studioprocent)/100;
            apartment=a*65;




        }



        if(s.equals("June") || s.equals("September")){

             if(a>14){
                studioprocent=80;
            }
            double g=a*75.2;
            studio=(g*studioprocent)/100;
            apartment=a*68.7;




        }


        if(s.equals("July") || s.equals("August")){


            studio=a*76;
            apartment=a*77;




        }


        if(a>14){
            apartmentprocent=90;

        }

        apartment=(apartment*apartmentprocent)/100;
        System.out.printf("Apartment: %.2f lv.",apartment);
        System.out.println();
        System.out.printf("Studio: %.2f lv.",studio);
    }
}
