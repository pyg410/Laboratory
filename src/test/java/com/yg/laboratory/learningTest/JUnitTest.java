package com.yg.laboratory.learningTest;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class JUnitTest {

    static JUnitTest jUnitTest;
    static Logger log = LoggerFactory.getLogger("log");

    @Test
    public void test1(){
        assertThat("1", true);
    }

    @Test
    public void test2(){
        assertThat(this, is(not(sameInstance(jUnitTest))));

    }
}
