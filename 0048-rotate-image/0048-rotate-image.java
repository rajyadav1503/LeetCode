class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int temp = matrix[i][j];
        //         matrix[i][j]=matrix[j][i];
        //         matrix[j][i]=temp;
        //     }
        // }

        // for(int i=0;i<n;i++){
        //     int left = 0;
        //     int right = n-1;
        //     while(left<right){
        //         int temp = matrix[i][left];
        //         matrix[i][left] = matrix[i][right];
        //         matrix[i][right]= temp;
        //         left++;
        //         right--;
        //     }
        // }

        //By noticing the pattern and storing into res array ;
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[i][j]=matrix[n-1-j][i];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=res[i][j];
            }
        }

    }
}