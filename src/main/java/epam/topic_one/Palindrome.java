package epam.topic_one;

class Palindrome {

    static boolean checkPalindrome(Integer number) {
        boolean isPalindrome = true;
        var chars = number.toString().toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
