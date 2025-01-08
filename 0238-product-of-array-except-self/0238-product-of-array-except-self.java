/*class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

            for(int i = 0; i < nums.length; i++){
                int product = 1; 
                for(int j = 0; j < nums.length; j++){
                    if(i==j){
                        continue;
                    }
                    else{
                        product*=nums[j];
                    }
                }
                answer[i] = product; 
            }
            return answer;
    }
}  only 19 testcases passed with this code out of 24 tc. */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];


        answer[0] = 1;
        

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

  
        int suffixProduct = 1;
        
      
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffixProduct;
            suffixProduct *= nums[i];
        }

        return answer;
    }
}


