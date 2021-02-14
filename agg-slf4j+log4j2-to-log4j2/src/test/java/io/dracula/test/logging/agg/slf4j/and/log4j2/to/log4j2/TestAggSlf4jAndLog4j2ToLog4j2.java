package io.dracula.test.logging.agg.slf4j.and.log4j2.to.log4j2;

import io.dracula.test.logging.todo.log4j2.TestLog4j2;
import io.dracula.test.logging.todo.slf4j.TestSlf4j;
import org.junit.Test;

public class TestAggSlf4jAndLog4j2ToLog4j2 {

    @Test
    public void log(){
        TestLog4j2.log();
        TestSlf4j.log();
    }

}
