import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[][] events = {
                {1,3,2},
                {4,5,2},
                {2,4,3}
        };
        int expected = 4;
        int actual = new Solution().maxTwoEvents(events);

        Assert.assertEquals(expected, actual);
    }
}
