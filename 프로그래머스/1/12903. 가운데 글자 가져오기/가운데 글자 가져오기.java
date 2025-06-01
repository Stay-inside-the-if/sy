class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        if (length % 2 != 0){
            int idx = length / 2;
            answer = s.substring(idx, idx + 1);
        }else{
            int idx = length / 2;
            answer = s.substring(idx - 1, idx + 1);
        }
        return answer;
    }
}