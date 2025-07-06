class Solution {
    public long solution(int n) {
        long[] memo = new long[100001];
        fibo(n, memo);
        return memo[n];
    }
    
    void fibo(int n, long memo[]){
        memo[0] = 0;
        memo[1] = 1;
        
        for (int i = 2; i <= n; i++){
            memo[i] = (memo[i - 2] + memo[i - 1]) % 1234567;
        }
    }
}