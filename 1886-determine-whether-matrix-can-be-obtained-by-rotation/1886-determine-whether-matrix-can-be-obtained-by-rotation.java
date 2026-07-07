class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = target.length;
        boolean rotate0 = true;
        boolean rotate1 = true;
        boolean rotate2 = true;
        boolean rotate3 = true;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( mat[i][j] != target[j][n-1-i] ){
                    rotate1 = false;
                }

                if( mat[i][j] != target[n-1-i][n-1-j] ){
                    rotate2 = false;
                }
                if( mat[i][j] != target[n-1-j][i] ){
                    rotate3 = false;
                }

                if( mat[i][j] != target[i][j] ){
                    rotate0 = false;
                }
            }
        }

        return (rotate0 || rotate1 || rotate2 || rotate3);
    }
}