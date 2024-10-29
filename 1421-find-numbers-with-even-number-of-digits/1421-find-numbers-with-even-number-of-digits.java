class Solution {
    public int findNumbers(int[] nums) {
        int count = 0; 
        for(int num : nums){
            String number = String.valueOf(num);
            int length = number.length();
            if(length%2==0){
                count++;
            } 
        }
        return count;
    }
}