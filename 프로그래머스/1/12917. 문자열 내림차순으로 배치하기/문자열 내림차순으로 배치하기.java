import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        return Arrays.stream(arr)
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.joining());
    }
}