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
