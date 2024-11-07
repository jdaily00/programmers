class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        // 1. 분수의 덧셈을 위해 통분
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        
        // 2. 조건이 기약분수 => 최대공약수로 약분
        // 분모와 분자 중 어떤 게 더 큰 값일지 알 수 없으므로
        int max = 1; // 최대공약수
        
        for (int i=1; i<=numer && i<=denom; i++) {
            if (numer%i == 0 && denom%i == 0 ) {
                max = i; // 최대공약수 업데이트
            }
        }
            
        // 3. 최대공약수를 구했으니 약분
        numer = numer/max;
        denom = denom/max;
        
        // 4. 분자와 분모를 순서대로 담은 배열
        int[] answer = {numer, denom};
        
        return answer;
    }
}