package loggingTutorial;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jExample {

    private static final Logger log = LogManager.getLogger(log4jExample.class.getName());

    public static void main(String[] args) {
        log.debug("this is debug");
        log.error("this is error");
    }

}
