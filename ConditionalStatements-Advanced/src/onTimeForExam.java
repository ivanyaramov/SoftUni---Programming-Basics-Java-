
import java.util.Scanner;

public class onTimeForExam{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int izpitchas = Integer.parseInt(scanner.nextLine());
        int izpitmin = Integer.parseInt(scanner.nextLine());
        int pristiganechas = Integer.parseInt(scanner.nextLine());
        int pristiganemin = Integer.parseInt(scanner.nextLine());
        int m=0;
        int c=0;
        String s=" ";

        if(izpitmin>=30){
            if((pristiganemin<izpitmin-30 && izpitchas==pristiganechas) || pristiganechas<izpitchas){
                //early
                s="before";
                System.out.println("Early");
                if(pristiganemin<izpitmin-30 && izpitchas==pristiganechas){
                    m=izpitmin-pristiganemin;
                }
                else if(pristiganechas<izpitchas){
                    if(pristiganemin>izpitmin){
                        m=izpitmin+(60-pristiganemin);
                        c=izpitchas-pristiganechas-1;
                    }
                    else{
                        c=izpitchas-pristiganechas;
                        m=izpitmin-pristiganemin;
                    }
                }

            }
            else if(pristiganemin>=izpitmin-30 && pristiganemin<=izpitmin && izpitchas==pristiganechas){
                //on time
                s="before";
                System.out.println("On time");
                m=izpitmin-pristiganemin;
            }
            else if((pristiganemin>izpitmin && izpitchas==pristiganechas) || pristiganechas>izpitchas){
                //late
                s="after";
                System.out.println("Late");
                if(pristiganemin>izpitmin && izpitchas==pristiganechas){
                    m=pristiganemin-izpitmin;
                }
                else {
                    if(pristiganemin<izpitmin){
                        c=pristiganechas-izpitchas-1;
                        m=(60-izpitmin) + pristiganemin;
                    }
                    else{
                        c=pristiganechas-izpitchas;
                        m=pristiganemin-izpitmin;
                    }

                }
            }
        }
        else {
            if((pristiganemin<60-(30-izpitmin) && pristiganechas== izpitchas-1) || pristiganechas<izpitchas-1){
                //early
                s="before";
                System.out.println("Early");
                if(pristiganemin>izpitmin){
                    m=izpitmin+(60-pristiganemin);
                    c=izpitchas-pristiganechas-1;
                }
                else{
                    c=izpitchas-pristiganechas;
                    m=izpitmin-pristiganemin;
                }
            }
            else if((pristiganemin>=60-(30-izpitmin) && pristiganechas== izpitchas-1) || (pristiganemin<=izpitmin && pristiganechas==izpitchas)){
                //on time
                s="before";
                System.out.println("On time");
                if(pristiganemin>=60-(30-izpitmin) && pristiganechas== izpitchas-1){
                    m=izpitmin + (60-pristiganemin);
                }
                else{
                    m=izpitmin-pristiganemin;
                }
            }
            else if((pristiganemin>izpitmin && izpitchas==pristiganechas) || izpitchas<pristiganechas){
                //late
                s="after";
                System.out.println("Late");
                if(pristiganemin>izpitmin && izpitchas==pristiganechas){
                    m=pristiganemin-izpitmin;
                }
                else {
                    if(pristiganemin<izpitmin){
                        c=pristiganechas-izpitchas-1;
                        m=(60-izpitmin) + pristiganemin;
                    }
                    else{
                        c=pristiganechas-izpitchas;
                        m=pristiganemin-izpitmin;
                    }

                }


            }
        }
        if(c==0){
            System.out.printf("%d minutes %s the start",m,s);
        }
        else{
            if(m>=10) {
                System.out.printf("%d:%d hours %s the start", c, m, s);
            }
            else{
                System.out.printf("%d:0%d hours %s the start", c, m, s);
            }


        }
    }
}
