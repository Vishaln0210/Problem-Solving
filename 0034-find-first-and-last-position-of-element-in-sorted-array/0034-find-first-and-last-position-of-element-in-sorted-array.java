class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                int left = mid;
                int right = mid;
                
                // Expand to the left
                while (left > 0 && nums[left - 1] == target) {
                    left--;
                }
                // Expand to the right
                while (right < nums.length - 1 && nums[right + 1] == target) {
                    right++;
                }
                
                return new int[] {left, right};
            }
        }
        
        return new int[] {-1, -1}; // Target not found
    }
}
