package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrueFalse {
    @Test
    public void test1(){
        String thing = "Noah";
        Assertions.assertTrue(thing.length() == 4);
    }
    @Test
    public void test2(){
        String thing = "Mio";
        Assertions.assertTrue(thing.endsWith("anz"));
    }
    @Test
    public void test3(){
        String thing = "Eunie";
        Assertions.assertFalse(thing.startsWith("A"));
    }
    @Test
    public void test4(){
        String thing = null;
        Assertions.assertNull(thing);
    }
}
