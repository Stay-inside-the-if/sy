class Solution {
    public int solution(int[] common) {
        if (common[0] == common[1]){
            return common[0];
        }
        int answer = 0;
        int difference;
        int ratio;
        
        if (common[0] != 0){
            difference = common[1] - common[0];
            ratio = common[1] / common[0];
            
            if (common[2] - common[1] == difference){
                int idx = common.length - 1;
                answer = common[idx] + difference;
            }else{
                int idx = common.length - 1;
                answer = common[idx] * ratio;
            }
        }else{
            difference = common[2] - common[1];
            ratio = common[2] / common[1];
            
            if (common[1] - common[0] == difference){
                int idx = common.length - 1;
                answer = common[idx] + difference;
            }else{
                int idx = common.length - 1;
                answer = common[idx] * ratio;
            }
        }
        
        return answer;
    }
}