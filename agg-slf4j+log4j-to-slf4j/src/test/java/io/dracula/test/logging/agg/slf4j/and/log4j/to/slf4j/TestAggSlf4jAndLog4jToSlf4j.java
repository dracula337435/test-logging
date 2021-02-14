package io.dracula.test.logging.agg.slf4j.and.log4j.to.slf4j;

import io.dracula.test.logging.todo.log4j.TestLog4j;
import io.dracula.test.logging.todo.slf4j.TestSlf4j;
import org.junit.Test;

public class TestAggSlf4jAndLog4jToSlf4j {

    @Test
    public void test(){
        TestLog4j.log();
        TestSlf4j.log();
    }

}
