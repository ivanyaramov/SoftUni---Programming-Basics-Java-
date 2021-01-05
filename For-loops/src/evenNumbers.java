import java.util.Scanner;

public class evenNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double minodd=99999;
        double maxodd=-99999;
        double sumodd=0;
        double mineven=99999;
        double maxeven=-99999;
        double sumeven=0;
        for (int i=1;i<=n;i++){
            double a = Double.parseDouble(scanner.nextLine());
            if(i%2==1){
                sumodd=sumodd+a;
                if(a<minodd){
                    minodd=a;
                }
                if(a>maxodd){
                    maxodd=a;
                }


            }



            else{
                sumeven=sumeven+a;
                if(a<mineven){
                    mineven=a;
                }
                if(a>maxeven){
                    maxeven=a;
                }


            }
        }
        System.out.printf("OddSum=%.2f,",sumodd);
        System.out.println();
        if(n<1){
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");

        }
        else{
            System.out.printf("OddMin=%.2f,",minodd);
            System.out.println();
            System.out.printf("OddMax=%.2f,",maxodd);
            System.out.println();


        }

        System.out.printf("EvenSum=%.2f,",sumeven);
        System.out.println();
        if(n<2){
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");

        }
        else{
            System.out.printf("EvenMin=%.2f,",mineven);
            System.out.println();
            System.out.printf("EvenMax=%.2f",maxeven);
            System.out.println();


        }


    }
}
