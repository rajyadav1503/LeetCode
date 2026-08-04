class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int smallest = nums[0];
        int largest = nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]<smallest) smallest = nums[i];

            if(nums[i]>largest) largest = nums[i];
        }

        for(int j=smallest ; j<=largest ; j++){
            boolean contains = false;
            for(int i=0;i<n;i++){
                if(j==nums[i]) contains = true;
            }

            if(!contains) list.add(j);
        }

        return list;
        
    }
}