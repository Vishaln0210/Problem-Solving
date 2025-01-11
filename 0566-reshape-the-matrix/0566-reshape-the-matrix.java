class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] newmat = new int[r][c];
        int row = 0; 
        int col = 0;
        int m = mat.length; 
        int n = mat[0].length;
        if(r * c != m * n){
            return mat;
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                newmat[row][col] = mat[i][j];
                col++;
                if(col == c){
                    col = 0;
                    row++;
                }
            }
        }
        return newmat;
    }
}