package Day13;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class C03_Log4j {
    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        Logger logger = Logger.getLogger(C03_Log4j.class);

        logger.trace("this is a trace message");
        logger.debug("this is a debug message");
        logger.info("this is a info message");
        logger.warn("this is a warn message");
        logger.error("this is a error message");
        logger.fatal("this is a fatal message");

    }

// seviye info olarak belirlendiğinden info ve altındakileri gördük.

}
