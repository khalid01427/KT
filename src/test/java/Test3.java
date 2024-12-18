import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(ListenersTestNG.class)
public class Test3 {
    @Test
    public void test3_1() {
        System.out.println("This is Test3_1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void test3_2() {
        System.out.println("This is Test3_2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void test3_3() {
        System.out.println("This is Test3_3");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
