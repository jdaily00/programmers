import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // N (바구니 개수), M (공 교환 횟수)
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        
        // 바구니 초기화
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }
        
        // M번의 공 교환
        for (int t = 0; t < M; t++) {
            String[] swapCommand = br.readLine().split(" ");
            int i = Integer.parseInt(swapCommand[0]) - 1;
            int j = Integer.parseInt(swapCommand[1]) - 1;
            
            // i번 바구니와 j번 바구니에 있는 공 교환
            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int ball : baskets) {
            sb.append(ball).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
