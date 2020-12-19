public class App {
    public static void main(String[] args) {
        int number = 1;
        double floatNumber = 1.1;
        boolean checkSum = floatNumber + number == 2.2;
        char a = 'a';
        String str = "I`m the string";
        String charString = String.valueOf(a);
        String[] strArr = { str, str.replaceFirst("the", charString) };
    }
}
