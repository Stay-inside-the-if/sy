class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroNum = 0;
        int match = 0;
        
        for (int i = 0; i < lottos.length; i++){
            if (lottos[i] == 0){
                zeroNum++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++){
                if (lottos[i] == win_nums[j]){
                    match++;
                }
            }
        }
        
        int max = match + zeroNum;
        int min = match;
        
        answer[0] = getRank(max);
        answer[1] = getRank(min);
        
        return answer;
    }
    
    int getRank(int num){
        switch (num)
        {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}