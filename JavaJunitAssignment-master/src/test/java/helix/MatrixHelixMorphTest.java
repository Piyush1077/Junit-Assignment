package helix;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class MatrixHelixMorphTest {

    /** Check if two integer matrices have the same contents
     *
     * @param matrix1 a 2-D matrix
     * @param matrix2 a 2-D matrix
     * @return true if the contents of matrix1 and matrix2 are identical and false otherwise
     */
    public static boolean testEqual(int[][] matrix1, int[][] matrix2) {

        /*
            Basic sanity checking:
                Verify that lengths are equal
         */
        if (matrix1 == null || matrix2 == null) {
            return true;
        }
        if (matrix1.length != matrix2.length) {
            return false;
        }
        if (matrix1[0].length != matrix2[0].length) {
            return false;
        }

        /*
            Test the contents of the matrices
         */
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    @Test
    public void test0x0() {
        int[][] inMatrix  = {{}};
        int[][] expOutput = null;
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test2x2() {
        int[][] inMatrix  = { {1, 2}, {3, 4} };
        int[][] expOutput = { {1, 2}, {4, 3} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test1x1() {
        int[][] inMatrix  = { {1} };
        int[][] expOutput = { {1} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test1x3() {
        int[][] inMatrix  = { {1,2,3} };
        int[][] expOutput = { {1,2,3} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test3x1() {
        int[][] inMatrix  = { {1},{2},{3} };
        int[][] expOutput = { {1},{2},{3} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test3x3() {
        int[][] inMatrix  = { {1, 2, 3}, {4, 5, 6}, {7,8,9} };
        int[][] expOutput = { {1, 2, 3}, {8, 9, 4}, {7,6,5} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test2x3() {
        int[][] inMatrix  = { {1, 2, 3}, {4, 5, 6} };
        int[][] expOutput = { {1, 2, 3}, {6,5,4} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test4x4() {
        int[][] inMatrix  = { {1, 2, 3,4}, { 5, 6, 7, 8}, {9,10,11,12}, {13,14,15,16}};
        int[][] expOutput = { {1, 2, 3,4}, {12,13,14,5}, {11,16,15,6}, {10,9,8,7} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test5x3() {
        int[][] inMatrix  = { {1, 2, 3}, { 4, 5, 6 }, {7, 8, 9}, {10,11,12}, {13,14,15}};
        int[][] expOutput = { {1, 2, 3}, {12,13,4}, {11,14,5}, {10,15,6}, {9,8,7} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test6x5() {
        int[][] inMatrix  = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10 }, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}, {26,27,28,29,30}};
        int[][] expOutput = { {1, 2, 3,4,5}, {18,19,20,21,6}, {17,28,29,22,7}, {16,27,30,23,8}, {15,26,25,24,9}, {14,13,12,11,10} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    // ADD TESTS TO CHECK PARTITIONS
}
