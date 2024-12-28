class Solution {
    public boolean canJump(int[] nums) {
        int last_index = nums.length - 1;
        int farthest = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                return false;
            }
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= last_index) {
                return true;
            }
        }
        
        return false;
    }
}
