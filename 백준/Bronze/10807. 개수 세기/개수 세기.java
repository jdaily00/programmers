import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다.
        int n = Integer.parseInt(br.readLine());
        
        // 둘째 줄에는 정수가 공백으로 구분되어져있다.
        String[] input = br.readLine().split(" ");
        int[] x = new int[input.length];
        for(int i=0; i<input.length; i++) {
            x[i] = Integer.parseInt(input[i]);
        }
            
        // 셋째 줄에는 찾으려고 하는 정수 v가 주어진다.
        int v = Integer.parseInt(br.readLine());
        
        // 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
        int count=0;
        if (n >= 1 && n <= 100 && v >= -100 && v <= 100) {
            for(int j=0; j<x.length; j++) {
                if(x[j] == v) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}