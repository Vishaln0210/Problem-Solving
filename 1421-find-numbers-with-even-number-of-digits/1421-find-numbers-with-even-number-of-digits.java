/*class Solution {
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
}*/
class Solution {
    public int findNumbers(int[] nums){
 
        int even = 0; 
        for(int num:nums){ 
            int count = 0;
            while(num > 0){
                 num/=10;
                 count++;
            }
            if(count%2==0){
                even++;
            }
        }
        return even;
    }
}