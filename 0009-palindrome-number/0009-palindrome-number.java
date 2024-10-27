class Solution {
    public boolean isPalindrome(int x) {
        int newnumber = 0;
        int originalnumber = x;
        if(x < 0){
            return false;
        }
        while(x != 0){
            int digit = x % 10;
            newnumber = newnumber * 10 + digit;
            x/=10;
        }
        return originalnumber == newnumber;
    }
}