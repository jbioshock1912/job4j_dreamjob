package epam.topic_one;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareRootTest {

    @Test
    public void testGetSquareRootPositive_1() {
        var number = SquareRoot.getSquareRoot(256);

        Assert.assertEquals(16, number);
    }

    @Test
    public void testGetSquareRootPositive_2() {
        var number = SquareRoot.getSquareRoot(84);

        Assert.assertEquals(9, number);
    }

    @Test
    public void testGetSquareRootPositive_3() {
        var number = SquareRoot.getSquareRoot(2);

        Assert.assertEquals(1, number);
    }

    @Test
    public void testGetSquareRootPositive_4() {
        var number = SquareRoot.getSquareRoot(0);

        Assert.assertEquals(0, number);
    }

    @Test
    public void testGetSquareRootPositive_5() {
        var number = SquareRoot.getSquareRoot(1);

        Assert.assertEquals(1, number);
    }
}