class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length;){
            if (i == -1){
                break;
            }
            
            char x = arr[i];
            i = disassemble(x, i, arr);
            answer++;
        }
        return answer;
    }
    
    int disassemble(char x, int index, char[] arr){
        int xCount = 1;
        int nxCount = 0;
        
        int i = index + 1;
        for (; i < arr.length; i++){
            if (arr[i] == x){
                xCount++;
            }else{
                nxCount++;
            }
            
            if (xCount == nxCount){
                xCount = 1;
                nxCount = 0;
                
                return i + 1;
            }
        }
        
        return -1;
    }
}