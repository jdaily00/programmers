import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        
        String input = br.readLine();

        // 크로아티아 알파벳 처리
        for (String alphabet : croatia) {
            // 크로아티아 알파벳을 공백 문자로 대체
            input = input.replace(alphabet, " ");
        }
        System.out.println(input.length());
    }
}
