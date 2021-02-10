package io.dracula.test.logging.todo.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLog4j2 {

    private static final Logger logger = LogManager.getLogger(TestLog4j2.class);

    public static void log(){
        logger.info("by log4j2");
    }

}
