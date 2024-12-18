import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(ListenersTestNG.class)
public class Test4 {
    @Test
    public void test4_1() {
        System.out.println("This is Test4_1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void test4_2() {
        System.out.println("This is Test4_2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void test4_3() {
        System.out.println("This is Test4_3");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
