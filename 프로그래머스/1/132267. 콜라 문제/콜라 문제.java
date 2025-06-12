class Solution {
    public int solution(int a, int b, int n) {
        int received = 0;
        int having = n;
        
        while (having >= a){
            received += (having / a) * b;
            having = having % a + (having / a) * b;
        }
        return received;
    }
}