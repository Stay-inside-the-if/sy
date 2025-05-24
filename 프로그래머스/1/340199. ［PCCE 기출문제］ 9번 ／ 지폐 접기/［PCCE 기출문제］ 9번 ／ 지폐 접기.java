class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int billMin = bill[0] > bill[1] ? bill[1] : bill[0];
        int walletMin = wallet[0] > wallet[1] ? wallet[1] : wallet[0];
        int billMax = bill[0] > bill[1] ? bill[0] : bill[1];
        int walletMax = wallet[0] > wallet[1] ? wallet[0] : wallet[1];
        
        while (billMin > walletMin || billMax > walletMax){
            if (bill[0] > bill[1]){
                bill[0] /= 2;
            }else{
                bill[1] /= 2;
            }
            answer++;
            
            billMin = bill[0] > bill[1] ? bill[1] : bill[0];
            walletMin = wallet[0] > wallet[1] ? wallet[1] : wallet[0];
            billMax = bill[0] > bill[1] ? bill[0] : bill[1];
            walletMax = wallet[0] > wallet[1] ? wallet[0] : wallet[1];
        }
        
        return answer;
    }
}