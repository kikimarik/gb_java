import java.util.Arrays;

public class Base {
    static final int MODE_MATH = 1;
    static final int MODE_CONDITION = 2;

    public static void main(String[] args) {
        int[] binArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(Base.getReverseBinArr(binArr, Base.MODE_CONDITION)));
        System.out.println(Arrays.toString(Base.getReverseBinArr(binArr, Base.MODE_MATH)));
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
