class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        String scopy = new String(s);
        int pnum = scopy.split("p", -1).length - 1;
        
        scopy = new String(s);
        int ynum = scopy.split("y", -1).length - 1;
        answer = (pnum == ynum);

        return answer;
    }
}