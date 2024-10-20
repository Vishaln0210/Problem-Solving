class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int temp = 0; 
        int max = 0; 
        for(int i = 0; i < nums.length; i++){
            if(temp > max){
                max = temp;
            }
            if(nums[i] == 1){
                count++;
            }
            else if(nums[i] == 0){
                count = 0;
            }
            temp = count;
            if(temp > max){
                max = temp;
            }
        }   
        return max;     
    }
}