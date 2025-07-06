import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        int[] copy = arr.clone();  
        int[] answer = new int[arr.length - 1];

        Arrays.sort(copy);
        int small = copy[0];
            
        int idx = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == small){
                continue;
            }
            answer[idx++] = arr[i];    
        }
        
        return answer;
    }
}