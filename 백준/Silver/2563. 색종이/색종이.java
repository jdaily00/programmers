import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 도화지 크기: 100x100
        boolean[][] paper = new boolean[100][100]; // 색종이가 붙은 영역을 표시하는 2차원 배열
        int n = Integer.parseInt(br.readLine()); // 색종이의 개수
        int totalArea = 0;

        // 색종이 정보 입력
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]); // 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이 거리
            int y = Integer.parseInt(input[1]); // 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이 거리

            // 색종이가 붙는 영역을 표시
            for (int row = x; row < x + 10; row++) { // x부터 x+10까지 (색종이의 가로 길이)
                for (int col = y; col < y + 10; col++) { // y부터 y+10까지 (색종이의 세로 길이)
                    if (!paper[row][col]) { // 아직 색종이가 붙지 않은 곳만 처리
                        paper[row][col] = true; // 색종이가 붙었다고 표시
                        totalArea++; // 넓이 증가
                    }
                }
            }
        }
        System.out.println(totalArea);
    }
}
