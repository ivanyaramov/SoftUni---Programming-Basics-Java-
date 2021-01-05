import java.util.Scanner;

public class passwordGenerator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        String s= "abcdefghi";
        char s1=' ';
        char s2=' ';
        for(int i=1;i<=a;i++){
            for(int k=1;k<=a;k++){
                for(int l=0;l<b;l++){
                    s1=s.charAt(l);
                    for(int g=0;g<b;g++){
                        s2=s.charAt(g);
                        for (int u=1;u<=a;u++){
                            if(u>i && u>k){
                                System.out.print(i);
                                System.out.print(k);
                                System.out.print(s1);
                                System.out.print(s2);
                                System.out.print(u+" ");

                            }

                        }
                    }
                }
            }
        }
    }
}
