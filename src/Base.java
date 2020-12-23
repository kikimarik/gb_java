import java.util.Arrays;

public class Base {
    static final int MODE_MATH = 1;
    static final int MODE_CONDITION = 2;

    public static void main(String[] args) {
        int[] binArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(Base.getReverseBinArr(binArr, Base.MODE_CONDITION)));
        System.out.println(Arrays.toString(Base.getReverseBinArr(binArr, Base.MODE_MATH)));

        int[] arrWrap = new int[8];
        System.out.println(Arrays.toString(Base.getArr(arrWrap)));

        int[] simpleArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(Base.getBoostArr(simpleArr, 2, 6)));
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
