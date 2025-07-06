import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        Integer[] arr = new Integer[10];
        
        Arrays.fill(arr, -1);
        
        int len = 0;
        while (n != 0){
            arr[len++] = (int)(n % 10);
            n /= 10;
        }
 
        Arrays.sort(arr, Collections.reverseOrder());

        for (int idx = 0; idx < len; idx++){
            answer *= 10;
            answer += arr[idx];
        }
        
        return answer;
    }
}