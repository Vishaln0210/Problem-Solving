class Solution {
    public boolean containsDuplicate(int[] nums) {
       int n = nums.length;
       HashSet<Integer> set = new HashSet<Integer>();
       for(int ni : nums){
        if(set.contains(ni)){
            return true;
        }
        else{
            set.add(ni);
        }
       }
       return false;     
    }
}  