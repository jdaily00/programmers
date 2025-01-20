import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 출석 번호 상태
        boolean[] submitted = new boolean[31];
        
        // 28명의 제출한 출석번호 입력
        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            submitted[num] = true; // 제출한 학생의 번호를 true로 표시
        }
        
        int first = 0, second = 0;
        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) { // 제출하지 않은 학생
                if (first == 0) {
                    first = i;
                } else {
                    second = i;
                }
            }
        }
        System.out.println(first);
        System.out.println(second);
    }
}
