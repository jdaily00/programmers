import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] numbers = new int[9];
        int max = Integer.MIN_VALUE;
        int index = -1;
        
        // 9개의 자연수를 입력받아 배열에 저장
        for (int i = 0; i < 9; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            if (numbers[i] > max) {
                max = numbers[i]; // 최대값 갱신
                index = i + 1;    // 1부터 시작하는 위치 저장
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
