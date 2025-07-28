import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < participant.length; i++){
            if (map.containsKey(participant[i])){
                int num = map.get(participant[i]);
                map.put(participant[i], num + 1);
            }else{
                map.put(participant[i], 1);
            }
        }
        
        for (int i = 0; i < completion.length; i++){
            if (map.containsKey(completion[i])){
                int num = map.get(completion[i]);
                if (num > 1){
                    map.put(completion[i], num - 1);
                }else{
                    map.remove(completion[i]);
                }
            }else{
                return completion[i];
            }
        }
        
        return map.keySet().iterator().next();
    }
}