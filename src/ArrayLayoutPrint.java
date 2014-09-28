import java.util.Arrays;

public class ArrayLayoutPrint {

    final static int ROW_COUNT = 8, COL_COUNT = 5;
    final static int RANGE_MIN = 1;
    final static int RANGE_MAX = 100;


    public static void main(String[] args) {

        int[][] myArray = new int[ROW_COUNT][COL_COUNT];

        for (int i = 0; i < ROW_COUNT; i++) {
            for (int j = 0; j < COL_COUNT; j++) {
                myArray[i][j] = (int) (Math.random() * (RANGE_MAX - RANGE_MIN + 1) + RANGE_MIN);
            }
            System.out.println(Arrays.toString(myArray[i]));
        }
    }
}