import java.util.*;

public class Solution {
    public int solution(int n) {
        return move(n);
    }
    
    int move(int n){
        if (n == 0){
            return 0;
        }else{
            if (n % 2 == 1){
                return 1 + move(n / 2);
            }else{
                return move(n / 2);
            }
        }
    }
}