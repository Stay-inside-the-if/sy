class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int copy = x;
        
        int sum = 0;
        while (copy > 0){
            sum += copy % 10;
            copy /= 10;
        }
        
        answer = (x % sum == 0) ? true : false;
        return answer;
    }
}