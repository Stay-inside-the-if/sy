class Solution {
    public long solution(int a, int b) {
        if (Math.abs(b - a) == 0 || Math.abs(b - a) == 1){
            return 0;
        }
        return (long)((double)(a + b) / 2 * (Math.abs(b - a) + 1));
    }
}