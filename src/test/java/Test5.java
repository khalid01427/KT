import org.testng.annotations.Test;

public class Test5 {
    @Test
    public void abc() {
        System.out.println("This is Test5");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
