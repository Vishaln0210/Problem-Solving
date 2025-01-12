/*class Solution {
    public int fib(int n){
        int a = 0;
        int b = 1;
        int count = 2;
        if(n==0){
            return 0;
        }                                                                                     
        while(n >= count){
            
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        return b;
    }
}*/
class Solution {
    public int fib(int n){
       if(n<2){return n;}
       return fib(n-1) + fib(n-2);
    }
}