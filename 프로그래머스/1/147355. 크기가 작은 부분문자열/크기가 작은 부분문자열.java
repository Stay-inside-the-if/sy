class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        long num = Long.parseLong(p);
        
        for (int i = 0; i < t.length() - len + 1; i++){
            long number = Long.parseLong(t.substring(i, i + len));
            if (number <= num){
                answer++;
            }
        }
        return answer;
    }
}