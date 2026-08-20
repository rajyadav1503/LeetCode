class Solution {
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        int count = 0;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                int k = j + 1;
                while (k < n && nums[k] < nums[i] + nums[j]) {
                    count++;
                    k++;
                }
            }
        }
        return count;
    }
}