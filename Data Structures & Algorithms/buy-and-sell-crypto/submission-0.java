class Solution {
    public int maxProfit(int[] prices) {
        int left =0;
        int right=0;
        int max_profit = 0;
        while(right<prices.length){
            if(prices[left]<prices[right]){
                int profit = prices[right]-prices[left];
                max_profit = Math.max(profit,max_profit);
            }
            else{
                left = right;
            }
            right++;
            
        }
        return max_profit;  

    }
}
