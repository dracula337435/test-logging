package io.dracula.test.logging.agg.log4j2.and.log4j.to.log4j2;

import io.dracula.test.logging.todo.log4j.TestLog4j;
import io.dracula.test.logging.todo.log4j2.TestLog4j2;
import org.junit.Test;

/**
 * @author dk
 */
public class TestAggLog4j2AndLog4jToLog4j2 {

    @Test
    public void test(){
        TestLog4j2.log();
        TestLog4j.log();
    }

}
