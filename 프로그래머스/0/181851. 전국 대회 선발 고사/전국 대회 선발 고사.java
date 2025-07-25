import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> selected = new ArrayList<>();
        
        for (int i = 0; i < rank.length; i++){
            map.put(rank[i], i);
            
            if (attendance[i]){
                selected.add(rank[i]);
            }
        }
        
        Collections.sort(selected);
        
        int a = map.get(selected.get(0));
        int b = map.get(selected.get(1));
        int c = map.get(selected.get(2));
        
        return 10000 * a + 100 * b + c;
    }
}