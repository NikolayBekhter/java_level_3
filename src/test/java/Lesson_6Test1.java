import lesson_6.Lesson_6;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Lesson_6Test1 {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 6, 5, 4, 2, 3, 3}, new int[]{2, 3, 3}},
                {new int[]{4, 3, 7, 5, 4, 4, 3, 2}, new int[]{3, 2}}
        });
    }

    private int[] in;
    private int[] out;

    public Lesson_6Test1(int[] in, int[] out) {
        this.in = in;
        this.out = out;
    }

    private Lesson_6 lesson6;

    @Before
    public void startTest() {
        lesson6 = new Lesson_6();
    }

    @Test
    public void testAfterLast4() {
        Assert.assertArrayEquals(out, lesson6.AfterLast4(in));
    }

    @Test(expected = RuntimeException.class)
    public void testAfterLast4Ex() {
        lesson6.AfterLast4(new int[]{0, 3, 7, 5, 0, 0, 3, 2});
    }

}
