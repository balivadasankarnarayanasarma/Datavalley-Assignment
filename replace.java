public class replace {
    public static String replaceCharAtIndex(String str, int index, char replacement) {
        if (str == null || index < 0 || index >= str.length()) {
            return str;
        }
        
        char[] charArray = str.toCharArray();
        charArray[index] = replacement;
        
        return new String(charArray);
    }

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        int indexToReplace = 7;
        char replacementChar = '*';

        String modifiedString = replaceCharAtIndex(originalString, indexToReplace, replacementChar);
        System.out.println("Modified String: " + modifiedString);
    }
}