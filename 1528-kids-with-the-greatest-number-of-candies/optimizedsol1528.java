class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();  // Find the maximum once
        ArrayList<Boolean> result = new ArrayList<>();
        
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);  // Compare with max directly
        }
        
        return result;
    }
}
