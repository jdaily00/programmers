import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫째 줄에 N과 X가 주어진다.
        String[] nx = br.readLine().split(" ");
        int n = Integer.parseInt(nx[0]);
        int x = Integer.parseInt(nx[1]);
        
        // 둘째 줄에 수열 A를 입력받아 배열로 저장
        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        
        for(int i=0; i<a.length; i++) {
            if(a[i] < x) {
                System.out.print(a[i]+" ");
            }
        }
    }
}