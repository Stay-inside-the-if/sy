import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Comparator;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < tangerine.length; i++){
            if (map.containsKey(tangerine[i])){
                int num = map.get(tangerine[i]);
                map.put(tangerine[i], num + 1);
            }else{
                map.put(tangerine[i], 1);
            }
        }
        
        List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        list.sort(Entry.comparingByValue(Comparator.reverseOrder()));
        
        int idx = 0;
        int result = 0;
        while (k > 0){
            result++;
            k -= list.get(idx++).getValue();
        }
        
        return result;
    }
}