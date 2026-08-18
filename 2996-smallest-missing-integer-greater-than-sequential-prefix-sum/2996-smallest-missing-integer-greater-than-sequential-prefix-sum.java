class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = 0;
        
        int i = 0;
        int newSum = nums[0];
        while (i < n - 1 && nums[i + 1] - nums[i] == 1) {
            newSum += nums[i + 1];
            i++;
        }
        sum = Math.max(sum, newSum);

        int x = sum;
        while (true) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (nums[j] == x) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                break; 
            }
            x++; 
        }

        int missingNumber = x;
        return missingNumber;
    }
}