import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2차원 배열 크기: 5행 15열
        char[][] arr = new char[5][15];
        
        // 배열을 빈 문자로 초기화 (모든 칸이 입력값으로 채워지지 않을 수 있으므로)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                arr[i][j] = ' ';
            }
        }

        // 입력 받기
        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j); // 문자 하나씩 배열에 저장
            }
        }

        // 결과 문자열 생성
        StringBuilder sb = new StringBuilder();
        for (int col = 0; col < 15; col++) { // 열 우선 탐색
            for (int row = 0; row < 5; row++) {
                if (arr[row][col] != ' ') { // 빈 문자가 아닌 경우만 추가
                    sb.append(arr[row][col]);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
