class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] arr = Arrays.copyOf(candies, candies.length);
        ArrayList<Boolean> maxornot = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            int max = 0;
            candies[i] = candies[i] + extraCandies;
            for(int j = 0; j < candies.length; j++){
            if(candies[j] > max){
                max = candies[j];
            }
        }
        if(max == candies[i]){
            maxornot.add(true);
        }
        else{
            maxornot.add(false);
        }
        System.arraycopy(arr, 0, candies, 0, candies.length);
    }
    return maxornot;
}
}