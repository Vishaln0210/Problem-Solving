/*class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0; 
        for(int i = low; i <= high; i++){
            int length = (int) Math.log10(i) + 1;
            String num = Integer.toString(i);
            int firstsum = 0; 
            int secondsum = 0; 
            while(length % 2 == 0){
            for(int j = 0; j < length/2; j++){
               
                firstsum+= (int)(num.charAt(j)); 
            }
            for(int k = length/2 + 1; k < length; k++){
             
                secondsum+= (int)(num.charAt(k)); 
            }
            if(firstsum == secondsum){
                count++;
            }
            }
                   
        }
        return count;
    }
}*/
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0; 
        
        for (int i = low; i <= high; i++) {
            String number = Integer.toString(i);
            int length = number.length();


            if (length % 2 != 0) 
            continue;
            int firstsum = 0;
            int secondsum = 0;
        for (int j = 0; j < length / 2; j++) {
                firstsum += number.charAt(j) - '0'; 
            }
            for (int j = length / 2; j < length; j++) {
                secondsum += number.charAt(j) - '0'; 
            }
            if (firstsum == secondsum) {
                count++;
            }
        }
        
        return count;
    }
}
