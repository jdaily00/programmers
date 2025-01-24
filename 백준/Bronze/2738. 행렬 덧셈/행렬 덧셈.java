import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫째 줄에 행렬의 크기 N과 M이 주어진다.
        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int m = Integer.parseInt(size[1]);

        // 행렬 A와 B를 저장할 배열
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        // 행렬 A 입력 받기
        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().split(" "); // 한 줄을 공백 기준으로 나누기
            for (int j = 0; j < m; j++) {
                arr1[i][j] = Integer.parseInt(row[j]); // 정수로 변환하여 저장
            }
        }

        // 행렬 B 입력 받기
        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().split(" "); // 한 줄을 공백 기준으로 나누기
            for (int j = 0; j < m; j++) {
                arr2[i][j] = Integer.parseInt(row[j]); // 정수로 변환하여 저장
            }
        }

        // 행렬 A와 B의 합을 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arr1[i][j] + arr2[i][j]).append(" "); // 두 행렬의 원소를 더해서 결과 저장
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
