class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;
        int minIdx = 0;
        int maxIdx = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] < nums[minIdx]) {
                minIdx = i;
            }

            if(nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }

        int left = Math.max(minIdx, maxIdx) + 1;

        int right = n - Math.min(minIdx, maxIdx);

        int minLeftMaxRight = minIdx + 1 + n - maxIdx;

        int maxLeftMinRight = maxIdx + 1 + n - minIdx;

        return Math.min(
            Math.min(left, right),
            Math.min(minLeftMaxRight, maxLeftMinRight)
        );
        
        // int maxremove = maxidx + 1;
        // int minremove = minidx + 1;
        // int dirmax = 0;
        // int dirmin = 0;
        // int total = 0;
        // if(maxremove > nums.length - (maxidx)){
        //     dirmax = 1;
        //     maxremove = nums.length - (maxidx);
        // }
        // if(minremove  > nums.length - (minidx)){
        //     dirmin = 1;
        //     minremove = nums.length - (minidx);
        // }

        // if(dirmax != dirmin){
        //     total = maxremove + minremove;
        // }else{
        //     total = Math.max(maxremove , minremove);
        // }

        // return total;
    }
}