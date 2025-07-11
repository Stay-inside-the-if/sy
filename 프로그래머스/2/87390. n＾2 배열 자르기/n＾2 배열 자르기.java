class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int)(right - left) + 1;
        int[] answer = new int[len];
        
        for (int i = 0; i < answer.length; i++){
            int row = (int)((left + i) / n) + 1;
            int col = (int)((left + i) % n) + 1;
            
            if (col <= row){
                answer[i] = row;
            }else{
                answer[i] = col;
            }
        }
        return answer;
    }
}