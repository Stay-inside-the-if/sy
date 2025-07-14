class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int none = getOne(n);
        for (int bigger = n + 1; bigger < 1000001; bigger++){
            int biggerone = getOne(bigger);
            if (none == biggerone){
                answer = bigger;
                break;
            }
        }
        return answer;
    }
    
    int getOne(int n){
        String nstr = Integer.toBinaryString(n);
        String replacestr = nstr.replace("1", "");
        
        return nstr.length() - replacestr.length();
    }
}