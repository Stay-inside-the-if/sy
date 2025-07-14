class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++){
            babbling[i] = babbling[i].replace("aya", "A");
            babbling[i] = babbling[i].replace("ye", "A");
            babbling[i] = babbling[i].replace("woo", "A");
            babbling[i] = babbling[i].replace("ma", "A");
            
            babbling[i] = babbling[i].replace("A", "");
            if (babbling[i].length() == 0){
                answer++;
            }
        }
        return answer;
    }
}