class Solution {
    public String[] solution(String[] quiz) {
        int len = quiz.length;
        String[] answer = new String[len];
        
        for (int i = 0; i < len; i++){
            boolean result = getResult(quiz[i]);
            if (result){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }
        return answer;
    }
    
    boolean getResult(String quiz){
        String[] cal = quiz.split(" ");
        int num1 = Integer.parseInt(cal[0]);
        int num2 = Integer.parseInt(cal[2]);
        int result = Integer.parseInt(cal[4]);
        
        if (cal[1].equals("+")){
            return result == num1 + num2;
        }else{
            return result == num1 - num2;
        }
    }
}