package algorithms.dataStructures.stack;

public class App {

    public static void main(String[] args) {


        System.out.println(reverseString("hello"));


    }

    private static String reverseString(String word) {
        char[] temp = word.toCharArray();
        Stack theStack = new Stack(temp.length);
        for(int i = 0; i < temp.length; i++) {
            theStack.push(temp[i]);
        }
        String result = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            result = result + ch;
        }
            return result;
    }
}
