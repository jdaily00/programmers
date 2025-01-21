import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    // 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다.
    String s = br.readLine();
    
    // 둘째 줄에 정수 i가 주어진다.
    int i = Integer.parseInt(br.readLine());
    
    char answer = s.charAt(i-1);
    
    System.out.println(answer);
    }
}