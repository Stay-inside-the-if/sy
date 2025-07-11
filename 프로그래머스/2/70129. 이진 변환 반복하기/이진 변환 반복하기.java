class Solution {
    public int[] solution(String s) {
        int zeroNum = 0;
        int binaryNum = 0;
        
        while (!s.equals("1")){
            String newS = s.replace("0", "");
            
            zeroNum += s.length() - newS.length();
            s = Integer.toBinaryString(newS.length());
            binaryNum++;
        }
        
        return new int[]{binaryNum, zeroNum};
    }
}