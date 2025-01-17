import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= 9; i++) {
            System.out.println(x + " * " + i + " = " + (x * i));
        }
    }
}
