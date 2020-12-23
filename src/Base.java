import java.util.Arrays;

public class Base {
    static final int MODE_MATH = 1;
    static final int MODE_CONDITION = 2;

    static final int MIN = 0;
    static final int MAX = 1;

    public static void main(String[] args) throws Exception {
        int[] binArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(Base.getReverseBinArr(binArr, Base.MODE_CONDITION)));
        System.out.println(Arrays.toString(Base.getReverseBinArr(binArr, Base.MODE_MATH)));

        int[] arrWrap = new int[8];
        System.out.println(Arrays.toString(Base.getArr(arrWrap)));

        int[] simpleArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(Base.getBoostArr(simpleArr, 2, 6)));

        int[][] matrixWrap = new int[4][4];
        Base.printMatrix(Base.getMatrix(matrixWrap));

        int[] simpleArr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(getMinValue(simpleArr2));
        System.out.println(getMaxValue(simpleArr2));

        int[] simpleArr3 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(isBalancable(simpleArr3));
    }

    private static boolean isBalancable(int[] arr) throws Exception {
        if (arr.length < 2) {
            throw new Exception("Can not balance array which length lt 2");
        }
        int leftBalance = 0;
        for (int i = 0; i < arr.length; i++) {
            leftBalance += arr[i];
            int rightBalance = 0;
            for (int j = arr.length - 1; j > i; j--) {
                rightBalance += arr[j];
            }
            if (leftBalance == rightBalance) {
                return true;
            }
        }

        return false;
    }

    private static int getMaxValue(int[] arr) throws Exception {
        return getValue(arr, Base.MAX);
    }

    private static int getMinValue(int[] arr) throws Exception {
        return getValue(arr, Base.MIN);
    }

    private static int getValue(int[] arr, int mode) throws Exception {
        if (arr.length == 0) {
            throw new Exception("Can not find value on empty array");
        }
        int value = arr[0];
        for (int i = 1; i < arr.length; i++) {
            switch (mode) {
                case Base.MIN -> value = Math.min(value, arr[i]);
                case Base.MAX -> value = Math.max(value, arr[i]);
            }
        }

        return value;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }

    private static int[][] getMatrix(int[][] matrix) {
        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            for (int colIndex = 0; colIndex < matrix[rowIndex].length; colIndex++) {
                matrix[rowIndex][colIndex] = colIndex == rowIndex ? 1 : 0;
            }
        }

        return matrix;
    }

    private static int[] getBoostArr(int[] arr, int kof, int to) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] < to ? arr[i] * kof : arr[i];
        }

        return arr;
    }

    private static int[] getArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }

        return arr;
    }

    private static int[] getReverseBinArr(int[] binArr, int mode) {
        long start = System.currentTimeMillis();
        StringBuilder previewText = new StringBuilder("The execution time ");
        for (int i = 0; i < binArr.length; i++) {
            switch (mode) {
                case Base.MODE_MATH -> {
                    binArr[i] -= 1;
                    binArr[i] *= -1;
                    if (i == 0) {
                        previewText.append("of mode math ");
                    }
                }
                case Base.MODE_CONDITION -> {
                    binArr[i] = binArr[i] == 0 ? 1 : 0;
                    if (i == 0) {
                        previewText.append("of mode condition ");
                    }
                }
            }
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        previewText
                .append("is ")
                .append(elapsed)
                .append(" ms.");
        System.out.println(previewText.toString());

        return binArr;
    }
}
