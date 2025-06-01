class Solution {
    public String solution(String s) {
        String answer = "";
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        String[] nums = s.split(" ");
        for (int i = 0; i < nums.length; i++){
            int num = Integer.parseInt(nums[i]);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}