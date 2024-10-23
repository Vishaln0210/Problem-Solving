class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int start = nums[0];
        int count = 0; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != start) {
                count++;
                nums[count] = nums[i];
                start = nums[i];
            }
        }

        return count + 1;
    }
}
