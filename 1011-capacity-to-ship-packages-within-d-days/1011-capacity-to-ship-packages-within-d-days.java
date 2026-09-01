class Solution {
    public int shipWithinDays(int[] weights, int days) {

        if(days > weights.length){
            return -1;
        }
        
        int sum = 0;
        int max = 0;
        for(int i = 0; i<weights.length; i++){
            sum += weights[i];
            max = Math.max(max , weights[i]);

        }

        int left = max ;
        int right = sum;
        int ans = -1;

        while(left <= right){
            int mid = left + (right-left) / 2;
            if(isPossible(weights , days , mid)){
                ans = mid ;
                right = mid -1;
            }else{
                left = mid+1;
            }
        }

        return ans;

    }

    private static boolean isPossible(int[] arr, int days, int mid) {
    int daysUsed = 1;
    int current = 0;
    
    for (int a : arr) {
        
        if (current + a > mid) {
            daysUsed++;   
            current = a;  
        } else {
            current += a; 
        }
    }
    return daysUsed <= days;
    }

}