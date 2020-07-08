import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import test.Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestTest1 {
    private int[] arrext;
    private boolean q;
    private Tests test;

    public TestTest1(int[] arrext, boolean q) {
        this.arrext = arrext;
        this.q = q;
    }

    @Before
    public void initialization(){
        test = new Tests();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new int[]{1,3,6}, false},
                {new int[]{1,1,1,4,4,1,4,4}, true},
                {new int[]{1,1,1,1,1,1}, false},
                {new int[]{4,4,4,4}, false},
                {new int[]{1,4,1,4,1,3}, false},
        });
    }

    @Test
    public void testFourAndOne(){
        Assert.assertEquals(test.fourAndOne(arrext),q);
    }


}
