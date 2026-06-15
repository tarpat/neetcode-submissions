class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rS = 0;
        int rE = matrix.length - 1;
        while (rS < rE) {
            int middle = (rS + rE) / 2;
            if (matrix[middle][0] > target) {
                rE = middle - 1;
            } else if (matrix[middle][matrix[0].length - 1] < target) {
                rS = middle + 1;
            } else {
                break;
            }
        }
        rS = (rS + rE) / 2;
        int s = 0;
        int e = matrix[rS].length - 1;
        while (s < e) {
            int middle = (s + e) / 2;
            if (matrix[rS][middle] < target) {
                s = middle + 1;
            } else if (matrix[rS][middle] > target) {
                e = middle - 1;
            } else {
                return true;
            }
        }
        if (s < matrix[rS].length && matrix[rS][s] == target)
            return true;

        return false;
    }
}
