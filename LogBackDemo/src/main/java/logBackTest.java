import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBackTest {

    private static Logger Log = LoggerFactory.getLogger(LogBackTest.class);

    @Test
    public void test() {

        Log.debug("debug log");
        Log.info("info log");
        Log.error("error log");

    }


}