class Solution {
    public boolean canJump(int[] nums) {
        int last_index = nums.length - 1;
        int farthest = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // If current position is unreachable, return false
            if (i > farthest) {
                return false;
            }
            // Update the farthest position we can reach
            farthest = Math.max(farthest, i + nums[i]);
            
            // If we can reach or exceed the last index, return true
            if (farthest >= last_index) {
                return true;
            }
        }
        
        return false;
    }
}
