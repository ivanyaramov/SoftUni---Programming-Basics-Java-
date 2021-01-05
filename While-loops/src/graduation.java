import java.util.Scanner;

public class graduation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ime = scanner.nextLine();
        int i =0;
        int d=0;
        double sum=0;
        while(true){
            double a = Double.parseDouble(scanner.nextLine());
            if(a<4){
                d++;
                i--;
            }
            sum+=a;
            i++;
            double sredno= sum/i;
            if(d==2){
                System.out.printf("%s has been excluded at %d grade",ime,i+1);
                break;
            }
            if(i==12){
                System.out.printf("%s graduated. Average grade: %.2f",ime,sredno);
                break;
            }
        }

    }
}
