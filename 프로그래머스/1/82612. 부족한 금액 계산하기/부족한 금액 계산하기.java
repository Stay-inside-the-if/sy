class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = (long)(((double)(price + price * count) / 2) * count);
        answer = sum - money;
        if (answer <= 0){
            return 0;
        }

        return answer;
    }
}