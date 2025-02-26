public class ReverseStringInPlace {
    public static void main(String[] args) {
        String str = "hello";
        char[] charArray = str.toCharArray(); // Convert string to char array

        int left = 0, right = charArray.length - 1;
        while (left < right) {
            // Swap characters at left and right pointers
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed word: " + new String(charArray));
    }
}
