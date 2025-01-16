import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        M -=45;
        if (0>M) {
            M+=60;
            H-=1;
         
            if (0>H) {
            H=23;
            }
        }
        System.out.println(H+" "+M);
    }
}