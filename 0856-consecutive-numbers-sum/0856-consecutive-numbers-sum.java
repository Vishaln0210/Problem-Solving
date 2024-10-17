/*class Solution {
    public int consecutiveNumbersSum(int n) {
        //int[] arr = new int[n];
        int sum = 0; 
        int count = 0;
        for(int i=1; i<=n; i++){
            sum = i;
            for(int j = i+1; j <=n; j++){
                sum += j;
            
                if(sum == n){
                count++;
                break;
            }
            else if(sum > n){
               break;
            }
            }
         
        }
        return count + 1;
       }
}*/   // ====> only 140 testcases passed here out of 170          




class Solution {
    public int consecutiveNumbersSum(int n) {
        int count = 0;
        for (int k = 1; k * (k - 1) / 2 < n; k++) {
       
            int numerator = n - k * (k - 1) / 2;
            if (numerator % k == 0) {
                count++;  
            }
        }
        
        return count;
    }
}