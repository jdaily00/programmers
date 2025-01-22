import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        // 팰린드롬 여부 확인
        if (isPalindrome(word)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    // 팰린드롬 여부를 확인하는 메서드
    private static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}