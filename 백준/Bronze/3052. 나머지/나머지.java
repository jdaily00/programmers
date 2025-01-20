import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashSet<Integer> remainders = new HashSet<>(); // 서로 다른 나머지를 저장할 Set
        
        // 10개의 숫자를 입력받아 42로 나눈 나머지를 계산
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            int remainder = num % 42; // 42로 나눈 나머지
            remainders.add(remainder); // Set에 추가
        }
        System.out.println(remainders.size());
    }
}
