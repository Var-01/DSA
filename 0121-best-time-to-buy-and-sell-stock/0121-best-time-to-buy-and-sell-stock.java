class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int currmax = 0;
        int max =0;

        int l = 0;
        int r = 1;
        while(r<n){
            if(arr[l] < arr[r]){
                currmax = arr[r] - arr[l];
                if(currmax > max){
                    max = currmax;
                }
            }
            else{
                l=r;
            }
            r++;
        }
        return max;


        // int profit =0;
        // int minValue = prices[0];
        // for(int i=0; i<prices.length; i++){
        //         minValue = Math.min(minValue,prices[i]);
        //         profit = Math.max(profit, prices[i]-minValue);
        // }
        // return profit;
    }
}