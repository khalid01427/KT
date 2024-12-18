import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TestAny
{
    public static void main(String[] args) {
        Logger logger=Logger.getLogger(TestAny.class);
        Logger logger1= LogManager.getLogger(TestAny.class);
        logger1.debug("this is a debug log message");
        logger1.info("this is a information log message");
        logger1.warn("this is a warning log message");

    }
}
