class Solution {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split(" ", -1);

        for (int i = 0; i < str.length; i++){
            if ("".equals(str[i])){
                if (i != str.length - 1){
                    answer += " ";
                }
            }else{
                answer += str[i].substring(0, 1).toUpperCase() + str[i].substring(1).toLowerCase();
                if (i != str.length - 1){
                    answer += " ";
                }
            }
        }
        return answer;
    }
}