public class App {
    static final int MAX_RANGE_NUMBER = 30;
    static final int MIN_RANGE_NUMBER = 10;

    public static void main(String[] args) {
        int number = 1;
        double floatNumber = 1.1;
        boolean checkSum = floatNumber + number == 2.2;
        char a = 'a';
        String str = "I`m the string";
        String charString = String.valueOf(a);
        String[] strArr = { str, str.replaceFirst("the", charString) };

        float first = (float) 1.2;
        float second = (float) 1.3;
        float third = (float) 1.4;
        float fourth = (float) 1.05;
        System.out.println(App.getSummary(first, second, third, fourth));

        int firstInt = (int) Math.round(Math.random() * App.MAX_RANGE_NUMBER);
        int secondInt = (int) Math.round(Math.random() * App.MAX_RANGE_NUMBER);
        System.out.println(App.checkFromRange(firstInt, secondInt));
    }

    private static boolean checkFromRange(int firstInt, int secondInt) {
        int sum = firstInt + secondInt;
        return sum >= App.MIN_RANGE_NUMBER && sum <= App.MAX_RANGE_NUMBER;
    }

    private static float getSummary(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
}
