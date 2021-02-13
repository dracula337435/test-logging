package io.dracula.test.logging.todo.log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author dk
 */
public class TestLog4j {

    private static final Logger logger = LogManager.getLogger(TestLog4j.class);

    public static void log(){
        logger.info("by log4j");
    }
}
