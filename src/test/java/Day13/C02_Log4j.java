package Day13;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class C02_Log4j {
    public static void main(String[] args) {

        Logger logger = LogManager.getLogger(C02_Log4j.class.getName());

        logger.trace("this is a trace message");
        logger.debug("this is a debug message");
        logger.info("this is a info message");
        logger.warn("this is a warn message");
        logger.error("this is a error message");
        logger.fatal("this is a fatal message");


    }
// varsayılan error olarak ayarlandığından  yazdırınca error ve fata alıyoruz sadece.
}
