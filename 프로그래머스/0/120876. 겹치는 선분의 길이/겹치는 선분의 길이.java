class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] x = new int[201];
        
        for (int i = 0; i < 3; i++){
            for (int j = lines[i][0] + 101; j <= lines[i][1] + 100; j++){
                if (x[j] == 1){
                    answer++;
                }
                x[j]++;
            }
        }
        return answer;
    }
}