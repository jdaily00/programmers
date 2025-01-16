import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력을 한 줄로 받아서 공백으로 분리
        String[] input = br.readLine().split(" ");
        
        int H = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        
        M -= 45;
        if (M < 0) {
            M += 60;
            H -= 1;
            
            if (H < 0) {
                H = 23;
            }
        }
        System.out.println(H + " " + M);
    }
}