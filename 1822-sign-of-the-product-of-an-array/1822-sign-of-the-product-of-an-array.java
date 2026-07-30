class Solution {
    public int arraySign(int[] nums) {
        int negativeNumber = 0;
        for(int i=0;i<nums.length ; i++){
            if(nums[i] < 0){
                negativeNumber++;
                
            }
            if(nums[i]==0) return 0;
        }
        return (negativeNumber%2 == 0 ) ? 1 : -1;
        
    }
}