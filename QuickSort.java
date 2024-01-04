class QuickSort {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int ans = bhai(arr);
        System.out.println(ans);
    }

    static int bhai(int[] prices) {

        // int min = 10000;
        // int max = 0;
        int maxprofit = 0;
        int profit =0;
        int n = prices.length-1;

        for(int i = 0; i < n; i++ ){
            for(int j = i+1; j < n; j++ ){
                
                if(prices[i] < prices[j]){
                    profit = prices[j] - prices[i];
                }
                if(profit > maxprofit){
                    maxprofit = profit;
                }
            }

            // if(prices[i] < min){
            //     min = prices[i];
            // }
            // else if( prices[i] > min){
            //     max = prices[i];  
                
            //     if(( max-min ) > profit){
            //         profit = max - min;
            // }
            // }
        }
        return maxprofit;
    }
}