// import java.util.*;

// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         List<Integer> answer = arraylist(nums); 
//         int[] ans = new int[answer.size()]; 
//         for (int i = 0; i < answer.size(); i++) {
//             ans[i] = answer.get(i); 
//         }
//         return ans; 
//     }

//     public List<Integer> arraylist(int[] nums) {
//         ArrayList<Integer> answer = new ArrayList<Integer>();
//         for (int i = 0; i < nums.length; i++) {
//             answer.add(nums[i]);
//         }
//         for (int i = 0; i < nums.length; i++) { 
//             answer.add(nums[i]); 
//         }
//         return answer;
//     }
// }
class Solution {
    public int[] getConcatenation(int[] nums) {
     int[] ans = IntStream.concat(IntStream.of(nums), IntStream.of(nums)).toArray();
     return ans;

    }
}