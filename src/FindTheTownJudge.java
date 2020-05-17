import org.junit.Assert;
import org.junit.Test;

public class FindTheTownJudge {

    public int findJudge(int N, int[][] trust) {
        int people[] = new int[N + 1];
        for (int[] t: trust) {
            int a = t[0];
            int b = t[1];
            people[a]--;
            people[b]++;
        }

        for (int i = 1; i <= N; i++) {
            if (people[i] == N - 1) {
                return i;
            }
        }

        return -1;
    }

    @Test
    public void test01() {
        int N = 2;
        int trust[][] = {{1,2}};
        Assert.assertEquals(2, new FindTheTownJudge().findJudge(N, trust));
    }

    @Test
    public void test02() {
        int N = 3;
        int trust[][] = {{1,3},{2,3}};
        Assert.assertEquals(3, new FindTheTownJudge().findJudge(N, trust));
    }

    @Test
    public void test03() {
        int N = 3;
        int trust[][] = {{1,3},{2,3},{3,1}};
        Assert.assertEquals(-1, new FindTheTownJudge().findJudge(N, trust));
    }

    @Test
    public void test04() {
        int N = 3;
        int trust[][] = {{1,2},{2,3}};
        Assert.assertEquals(-1, new FindTheTownJudge().findJudge(N, trust));
    }

    @Test
    public void test05() {
        int N = 4;
        int trust[][] = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        Assert.assertEquals(3, new FindTheTownJudge().findJudge(N, trust));
    }

}
