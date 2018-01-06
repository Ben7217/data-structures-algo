package algorithms;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverseString("string"));

    }

    static String reverseString(String word) {
        String result = "";
        char[] temp = word.toCharArray();

        for(int i = temp.length - 1; i >= 0; i--) {
            result += temp[i];
        }
        return result;
    }
}
