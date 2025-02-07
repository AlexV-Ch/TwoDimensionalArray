import java.util.Arrays;

public class TwoDimensionalArray {

    public static char[][] getTwoDimensionalArray(int size) {
        char[][] twoArray = new char[size][];
        for (int i = 0; i < twoArray.length; i++) {
            twoArray[i] = new char[size];
        }

        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                twoArray[i][j] = (i == j) ? 'X' : ' ';
            }
            twoArray[i][(twoArray.length - 1) - i] = 'X';
        }

        return twoArray;
    }

    public static void getPrintArray(char[][] twoArray) {
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                System.out.print(twoArray[i][j]);
                System.out.print(j < (twoArray[i].length - 1)  ? "" :"\n" );
            }
        }
    }

}
