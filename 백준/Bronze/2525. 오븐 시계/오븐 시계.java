import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(br.readLine());
        
        B+=C;
        
        A+=B/60;
        B=B%60;
        
        if (A>=24) {
            A=A%24;
        }
        System.out.println(A+" "+B);
    }
}