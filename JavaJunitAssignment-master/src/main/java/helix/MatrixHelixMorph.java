package helix;

import java.util.ArrayList;

public class MatrixHelixMorph {

    /**
     * @param inMatrix a 2-D array
     * @return a matrix that is morphed into a helix version of inMatrix
     */
    public static int[][] helix(int[][] inMatrix) {

        int rowLength = inMatrix.length;
        int columnLength = inMatrix[0].length;
        if (rowLength == 0 && columnLength == 0){
            return null;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for (int[] matrix : inMatrix) {
            for (int i : matrix) {
                arr.add(i);
            }
        }

            int top = 0,
                bottom = rowLength - 1,
                left = 0,
                right = columnLength - 1;

        int k = 0;

        while (true) {
            if (left > right) {
                break;
            }

            // print top row
            for (int i = left; i <= right; i++) {
                inMatrix[top][i] = arr.get(k++);
            }
            top++;

            if (top > bottom) {
                break;
            }

            // print right column
            for (int i = top; i <= bottom; i++) {
                inMatrix[i][right] = arr.get(k++);
            }
            right--;

            if (left > right) {
                break;
            }

            // print bottom row
            for (int i = right; i >= left; i--) {
                inMatrix[bottom][i] = arr.get(k++);
            }
            bottom--;

            if (top > bottom) {
                break;
            }

            // print left column
            for (int i = bottom; i >= top; i--) {
                inMatrix[i][left] = arr.get(k++);
            }
            left++;
        }
        return inMatrix;
    }

}
