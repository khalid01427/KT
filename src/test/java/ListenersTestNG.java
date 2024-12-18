import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.time.LocalDateTime;

public class ListenersTestNG implements ITestListener {
//    public void onStart(ITestContext context) {
//        System.out.println("onStart method started--"+ LocalDateTime.now());
//    }
//
//    public void onFinish(ITestContext context) {
//        System.out.println("onFinish method started"+ LocalDateTime.now());
//    }
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName()+" started at time--"+ LocalDateTime.now());
    }

//    public void onTestSuccess(ITestResult result) {
//        System.out.println("onTestSuccess Method" +result.getName()+" at time--"+ LocalDateTime.now());
//    }
}

