import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        BigInteger newNumber = BigInteger.ZERO;
        for (int digit : num) {
            newNumber = newNumber.multiply(BigInteger.TEN).add(BigInteger.valueOf(digit));
        }

        // Add `k` to the BigInteger number
        BigInteger sum = newNumber.add(BigInteger.valueOf(k));
        
        // Convert the result back to a list of integers
        List<Integer> list = new ArrayList<>();
        String sumStr = sum.toString();
        for (char ch : sumStr.toCharArray()) {
            list.add(Character.getNumericValue(ch));
        }
        
        return list;
    }
}
