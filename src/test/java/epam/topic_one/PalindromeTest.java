package epam.topic_one;


import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void checkPalindromePositive() {
        Assert.assertFalse(Palindrome.checkPalindrome(124));
    }

    @Test
    public void checkPalindromeNegative() {
        Assert.assertTrue(Palindrome.checkPalindrome(1221));
    }
}

