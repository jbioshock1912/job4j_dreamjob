package epam.topic_one;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void getIndexPositive_1() {
        int[] nums = {2, 7, 11, 15};
        int sum = 9;
        int[] result = Sum.getIndex(nums, sum);

        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(1, result[1]);
    }

    @Test
    public void getIndexPositive_2() {
        int[] nums = {3, 2, 4, 15};
        int sum = 6;
        int[] result = Sum.getIndex(nums, sum);

        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(2, result[1]);
    }

    @Test
    public void getIndexPositive_3() {
        int[] nums = {3, 2, 4, 15, 20, 14, 1, 10, 47};
        int sum = 15;
        int[] result = Sum.getIndex(nums, sum);

        Assert.assertEquals(5, result[0]);
        Assert.assertEquals(6, result[1]);
    }
}