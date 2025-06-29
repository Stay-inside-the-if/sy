class Solution {
    public String solution(int[] food) {
        String answer = "";
        String str = "";
        
        for (int i = 1; i < food.length; i++){
            int num = food[i] / 2;
            for (int j = 0 ; j < num; j++){
                str += i;
            }
        }
        StringBuffer sb = new StringBuffer(str);
        String reversedStr = sb.reverse().toString();

        answer = str + "0" + reversedStr;
        return answer;
    }
}