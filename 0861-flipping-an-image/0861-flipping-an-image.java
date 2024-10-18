class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] result_image = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = n-1; j >= 0; j--){
                result_image[i][n-j-1] = image[i][j];
               }
            }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(result_image[i][j] == 0){
                    result_image[i][j] = 1;
                }
                else{
                    result_image[i][j] = 0;
                }
            }    
        }
        return result_image;
    }
}