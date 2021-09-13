import org.junit.Test;

public class MyTest {
    @Test
    public void test1() {
        boolean flag1 = true;
        boolean flag2 = false;

        boolean f1 = flag1 || say(1);
        boolean f2 = flag2 || say(2);
    }

    public boolean say(int i) {
        System.out.println("hello " + i);
        return false;
    }
}
