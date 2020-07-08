import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import test.Tests;

public class TestTest {
    private static Tests test;

    @BeforeClass
    public static void initialization(){
        test = new Tests();
    }

    @Test
    public void testMassAfterFour1(){
        Assert.assertArrayEquals(new int[]{1,3,5}, test.massAfterFour(new int[]{1,45,74,6,4,1,3,5}));
    }

    @Test
    public void testMassAfterFour2(){
        Assert.assertArrayEquals(new int[]{1,3,5,67,345}, test.massAfterFour(new int[]{1,45,74,6,4,1,3,5,67,345}));
    }

    @Test(expected = RuntimeException.class)
    public void testMassAfterFour3(){
        Assert.assertArrayEquals(new int[]{1,3,5}, test.massAfterFour(new int[]{1,45,74,6,1,3,5}));
    }
}
