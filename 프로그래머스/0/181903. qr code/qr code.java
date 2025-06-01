class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        char[] codes = code.toCharArray();
        
        for (int i = r; i < codes.length; i += q){
            answer += codes[i];
        }
        return answer;
    }
}