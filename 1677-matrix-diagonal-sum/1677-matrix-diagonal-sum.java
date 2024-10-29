class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length; 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    sum+=mat[i][j];
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = n-1; j >= 0; j--){
                if(i == n/2 && j == n/2 && n%2!=0){
                    continue;
                }
                else if(i + j == n-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}