package io.dracula.test.logging.todo.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author dk
 */
public class TestSlf4j {

    private static final Logger logger = LoggerFactory.getLogger(TestSlf4j.class);

    public static void log(){
        logger.info("by slf4j");
    }

}
