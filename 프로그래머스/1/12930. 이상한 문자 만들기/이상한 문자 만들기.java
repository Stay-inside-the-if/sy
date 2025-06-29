class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ", -1);
        int len = arr.length;
        
        for (int i = 0; i < len; i++){
            char[] c = arr[i].toCharArray();
            for (int j = 0; j < c.length; j++){
                c[j] = (j % 2 == 0) ? Character.toUpperCase(c[j]) : Character.toLowerCase(c[j]);
            }
            
            String newStr = new String(c);
            answer += newStr;
            
            if (i != len - 1){
                answer += " ";
            }
        }
        return answer;
    }
}