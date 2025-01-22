import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 체스의 기본 구성 개수
        int[] defaultPieces = {1, 1, 2, 2, 2, 8};

        // 입력받은 피스 개수
        String[] input = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 6; i++) {
            sb.append(defaultPieces[i] - Integer.parseInt(input[i])).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
