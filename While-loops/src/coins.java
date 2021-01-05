import java.util.Scanner;

public class coins{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s = Double.parseDouble(scanner.nextLine());
        int br=0;
        while(s>=2) {
            s = s - 2;
            s+=0.00001;
            br++;
        }
            while(s>=1) {
                s = s - 1;
                s+=0.00001;
                br++;
            }
                while(s>=0.5) {
                    s = s - 0.5;
                    s+=0.00001;
                    br++;
                }
                    while(s>=0.2) {
                        s = s - 0.2;
                        s+=0.00001;
                        br++;
                    }
                        while(s>=0.1) {
                            s = s - 0.1;
                            s+=0.00001;
                            br++;
                        }
                            while(s>=0.05) {
                                s = s - 0.05;
                                s+=0.00001;
                                br++;
                            }
                                while(s>=0.02) {
                                    s = s - 0.02;
                                    s+=0.00001;
                                    br++;
                                }
                                    while(s>=0.01) {
                                        s = s - 0.01;
                                        s+=0.00001;
                                        br++;
                                    }



        System.out.println(br);
    }
}
