import java.util.Scanner;

public class sumOfVowels{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int sum=0;
        for(int i=0;i<a.length();i++){
            char b=a.charAt(i);
            if(b=='a'){
                sum=sum+1;
            }
           else if(b=='e'){
                sum=sum+2;
            }
            else if(b=='i'){
                sum=sum+3;
            }
            else if(b=='o'){
                sum=sum+4;
            }
            else if(b=='u'){
                sum=sum+5;
            }







        }
        System.out.println(sum);

    }
}
