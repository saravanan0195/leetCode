class Solution {
    public void rotate(int[][] matrix) {
        int left = 0, right = matrix.length - 1;
        while (left < right) {
            for (int i = 0; i < right - left; i++) {
                int top = left, bottom = right;
                // save topLeft value
                int topLeft = matrix[top][left + i];
                // move bottomLeft to topLeft
                matrix[top][left + i] = matrix[bottom - i][left];
                // move bottomRight to bottomLeft
                matrix[bottom - i][left] = matrix[bottom][right - i];
                // move topRight to bottomRight
                matrix[bottom][right - i] = matrix[top + i][right];
                // move topLeft to topRight
                matrix[top + i][right] = topLeft;
            }
            left++;
            right--;
        }
    }
}