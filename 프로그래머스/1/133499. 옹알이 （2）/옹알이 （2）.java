class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++){
            babbling[i] = babbling[i].replace("aya", "A");
            babbling[i] = babbling[i].replace("ye", "B");
            babbling[i] = babbling[i].replace("woo", "C");
            babbling[i] = babbling[i].replace("ma", "D");
            
            //연속된 같은 발음 검사
            babbling[i] = babbling[i].replace("AA", "E");
            babbling[i] = babbling[i].replace("BB", "E");
            babbling[i] = babbling[i].replace("CC", "E");
            babbling[i] = babbling[i].replace("DD", "E");
            
            babbling[i] = babbling[i].replace("A", "");
            babbling[i] = babbling[i].replace("B", "");
            babbling[i] = babbling[i].replace("C", "");
            babbling[i] = babbling[i].replace("D", "");
            
            if (babbling[i].length() == 0){
                answer++;
            }
        }
        return answer;
    }
}