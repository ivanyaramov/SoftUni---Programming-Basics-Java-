import java.util.Scanner;

public class everest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int br=1;
        int obshto=0;
        while(true){
            String a = scanner.nextLine();
            if(a.equals("END")){
                System.out.println("Failed!");
                System.out.println(5364+obshto);
                break;
            }
            if(a.equals("Yes")){
                br++;
            }
            if(br==6){
                System.out.println("Failed!");
                System.out.println(5364+obshto);
                break;
            }
            int b = Integer.parseInt(scanner.nextLine());

            obshto+=b;
            if(5364+obshto>=8848){
                System.out.printf("Goal reached for %d days!",br);
                break;
            }


        }

    }
}
