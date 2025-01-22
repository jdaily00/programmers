import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            sb.append(repeat(" ", N - i));
            sb.append(repeat("*", 2 * i - 1));
            sb.append("\n");
        }

        for (int i = N - 1; i > 0; i--) {
            sb.append(repeat(" ", N - i));
            sb.append(repeat("*", 2 * i - 1));
            sb.append("\n");
        }

        System.out.print(sb);
    }

    // 문자열 반복 메서드
    private static String repeat(String str, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(str);
        }
        return result.toString();
    }
}
