import java.util.Scanner;

public class ticketsForCinema{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String film=s;
        String t="";
        int svobodni=0;
        s = scanner.nextLine();
        svobodni = Integer.parseInt(s);
        int brsta = 0;
        int brsta2=0;
        int brstu=0;
        int brstu2=0;
        int brk=0;
        int brk2=0;
        int brobshto=0;
        double d=0;
        while(true){
            brk=0;
            brsta=0;
            brstu=0;
            brobshto+=svobodni;
            while(true){
                t = scanner.nextLine();
                if(t.equals("End")||t.equals("Finish")){
                    break;
                }

                if(t.equals("student")){
                    brstu++;
                }
                else if(t.equals("standard")){
                    brsta++;
                }
                else if(t.equals("kid")){
                    brk++;
                }
                if(brk+brstu+brsta>=svobodni){
                    break;
                }



            }
            brk2+=brk;
            brsta2+=brsta;
            brstu2+=brstu;


             d=(((brk+brsta+brstu)*1.0)/svobodni)*100;
            System.out.printf("%s - %.2f",film,d);
            System.out.print("% ");
            System.out.println("full.");

            if (t.equals("Finish")){

                break;
            }

            s = scanner.nextLine();
            film=s;
            if(s.equals("Finish")){
                break;
            }

                s = scanner.nextLine();
                svobodni = Integer.parseInt(s);

        }
        System.out.printf("Total tickets: %d",brk2+brsta2+brstu2);
        System.out.println();
        if(brk2+brsta2+brstu2==0){
            System.out.printf("0.00");
            System.out.print("% ");
            System.out.printf("student tickets.");
            System.out.println();
            System.out.printf("0.00");
            System.out.print("% ");
            System.out.printf("standard tickets.");
            System.out.println();
            System.out.printf("0.00");
            System.out.print("% ");
            System.out.printf("kids tickets.");

        }
        else {
            double kidp = brk2 * 1.0 / (brk2 + brsta2 + brstu2) * 100;
            double stap = brsta2 * 1.0 / (brk2 + brsta2 + brstu2) * 100;
            double stup = brstu2 * 1.0 / (brk2 + brsta2 + brstu2) * 100;
            System.out.printf("%.2f", stup);
            System.out.print("% ");
            System.out.printf("student tickets.");
            System.out.println();
            System.out.printf("%.2f", stap);
            System.out.print("% ");
            System.out.printf("standard tickets.");
            System.out.println();
            System.out.printf("%.2f", kidp);
            System.out.print("% ");
            System.out.printf("kids tickets.");
        }


    }
}
