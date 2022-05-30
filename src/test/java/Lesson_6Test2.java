import lesson_6.Lesson_6;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Lesson_6Test2 {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 4, 4, 4, 1, 4, 1}, true},
                {new int[]{8, 8, 7, 7, 7, 3, 5, 1}, false},
                {new int[]{1, 4, 8, 7}, false}
        });
    }
    private int[] in;
    private boolean out;

    public Lesson_6Test2(int[] in, boolean out) {
        this.in = in;
        this.out = out;
    }

    private Lesson_6 lesson6;

    @Before
    public void startTest() {
        lesson6 = new Lesson_6();
    }

    @Test
    public void testOnly1And4() {
        Assert.assertEquals(lesson6.Only1And4(in), out);
    }
}
