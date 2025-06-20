class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6){
            return false;
        }
        
        String upStr = s.toUpperCase();
        String lowStr = s.toLowerCase();
        
        if (upStr != lowStr){
            return false;
        }
        
        return true;
    }
}