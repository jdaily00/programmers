import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        String[] numbers = br.readLine().split(" ");
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(numbers[i]);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        System.out.println(min + " " + max);
    }
}
