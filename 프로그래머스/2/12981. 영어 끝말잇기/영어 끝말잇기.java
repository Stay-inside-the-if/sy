import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put(words[0], 0);
        int i = 1;
        for (; i < words.length; i++){
            if (map.containsKey(words[i])){
                break;
            }
            else if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)){
                break;
            }
            
            map.put(words[i], 0);
        }
        
        if (i == words.length){
            return new int[]{0, 0};
        }
        
        int num = i % n + 1;
        int order = i / n + 1;
        
        return new int[]{num, order};
    }
}