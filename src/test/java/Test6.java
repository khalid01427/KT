import org.testng.annotations.Test;

public class Test6 {
    @Test
    public void abc()  {

        System.out.println("This is Test6");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
