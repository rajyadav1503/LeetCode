class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
      

        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> result = new ArrayList<>();

        // Loop through every single element in the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int currentVal = matrix[i][j];
                
                // 1. Check if it's the minimum in its row
                boolean isMinInRow = true;
                for (int col = 0; col < m; col++) {
                    if (matrix[i][col] < currentVal) {
                        isMinInRow = false;
                        break; // Stop checking this row, it's not the minimum
                    }
                }

                // 2. Check if it's the maximum in its column
                boolean isMaxInCol = true;
                for (int row = 0; row < n; row++) {
                    if (matrix[row][j] > currentVal) {
                        isMaxInCol = false;
                        break; // Stop checking this column, it's not the maximum
                    }
                }

                // 3. If both conditions are true, we found a lucky number!
                if (isMinInRow && isMaxInCol) {
                    result.add(currentVal);
                }
            }
        }

        return result;
    }
}