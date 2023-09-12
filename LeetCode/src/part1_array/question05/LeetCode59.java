package part1_array.question05;

/**
 * @author lwx
 * @version 1.0
 * @since 2023-08-22-21:20
 */
public class LeetCode59 {

    public int[][] generateMatrix1(int n) {
        int startX = 0;
        int startY = 0;
        int offset = 1;

        int loop = n / 2;

        int i, j;
        int count = 1;
        int[][] result = new int[n][n];
        while (loop-- >= 0) {

            i = startX;
            j = startY;
            for (j = startY; j < n - offset; j++) {
                result[startX][j] = count++;
            }

            for (i = startX; i < n - offset; i++) {
                result[i][j] = count++;
            }

            for (; j > startY; j--) {
                result[i][j] = count++;
            }

            for (; i > startX; i--) {
                result[i][j] = count++;
            }
            startX++;
            startY++;
            offset += 1;
        }

        if (n % 2 == 1) {
            result[n / 2][n / 2] = count;
        }

        return result;
    }

    public int[][] generateMatrix(int n) {

        int count = 1;
        int startX = 0;
        int startY = 0;
        int offset = 1;
        int[][] result = new int[n][n];

        int loop = n / 2;

        int i, j;
        while (loop-- != 0) {
            for (j = startY; j < n - 1; j++) {
                result[startX][j] = count++;
            }

            for (i = startX; i < n - offset; i++) {
                result[i][j] = count++;
            }

            for (; j > startY; j--) {
                result[i][j] = count++;
            }

            for (; i > startX; i--) {
                result[i][j] = count++;
            }

            startX++;
            startY++;
            offset++;
        }

        if (n % 2 == 1) {
            result[n / 2][n / 2] = count;
        }
        return result;
    }

}
