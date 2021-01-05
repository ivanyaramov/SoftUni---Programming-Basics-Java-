import java.util.Scanner;

public class christmasTournament{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dni = Integer.parseInt(scanner.nextLine());
        String sport = " ";
        String rezultat = " ";
        int win=0;
        int lose=0;
        int br=0;
        int winobshto=0;
        int loseobshto=0;
        double parizaden=0;
        double pari=0;
        while(br<dni){
            while (true) {
                sport = scanner.nextLine();
                if(sport.equals("Finish")){
                    break;
                }
                rezultat = scanner.nextLine();

                if (rezultat.equals("win")) {
                    win++;

                    parizaden += 20;
                } else if (rezultat.equals("lose")) {
                    lose++;

                }
            }
            if(win>lose){
                pari=parizaden*1.1+pari;
                winobshto++;
            }
            else{
                loseobshto++;
                pari=parizaden+pari;
            }
            parizaden=0;
            win=0;
            lose=0;
            br++;

        }
        if(winobshto>loseobshto){
            pari=pari*1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f",pari);
        }
        else{
            System.out.printf("You lost the tournament! Total raised money: %.2f",pari);
        }

    }
}
