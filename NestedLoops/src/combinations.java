import java.util.Scanner;

public class combinations{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int br=0;
        for (int i=0;i<=a;i++){
            for (int k=0;k<=a;k++){
                for (int f=0;f<=a;f++){
                    if(i+k+f==a){
                        br++;
                    }
                }
            }

        }
        System.out.println(br);
    }
}
