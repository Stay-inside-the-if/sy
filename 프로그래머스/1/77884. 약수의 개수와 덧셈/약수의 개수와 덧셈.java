class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for (int i = left; i < right + 1; i++){
            if (Math.sqrt(i) == Math.floor(Math.sqrt(i))){
                sum -= i;
            }else{
                sum += i;
            }
        }
        
        return sum;
    }
}