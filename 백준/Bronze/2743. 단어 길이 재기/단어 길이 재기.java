import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 영어 소문자와 대문자로만 이루어진 단어가 주어진다.
        String word = br.readLine();
        
        int count = 0;
        for(int i=0; i<word.length(); i++) {
            count++;
        }
        System.out.println(count);
    }
}