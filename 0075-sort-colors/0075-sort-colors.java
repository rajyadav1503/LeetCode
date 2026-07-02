class Solution {
    public void sortColors(int[] nums) {
        int[] ans = new int[nums.length];
        int a=0;
        int b=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                    // a=i;
                    ans[a]=nums[i];
                    a++;
                }
            if(nums[i]==2){
                    // b=i;
                    ans[b]=nums[i];
                    b--;
                }
        }
        for(int i=a;i<=b;i++){
                ans[i]=1;
                // a++;
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
        
    }
}