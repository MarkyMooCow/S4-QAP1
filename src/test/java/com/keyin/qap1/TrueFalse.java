package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// This area is honestly a bit more basic.
// I'm going to run some tests that don't use a function at all.
// Names a bit exclusive due to originally planning of just True and False.
// But then I discovered a few more cool asserts!
public class TrueFalse {
    // This one will be to see if the length of the string is 4.
    @Test
    public void test1(){
        String str = "Noah";
        System.out.println(str);
        Assertions.assertTrue(str.length() == 4);
    }
    // This one will check to see if the string ends with io.
    @Test
    public void test2(){
        String str = "Mio";
        System.out.println(str);
        Assertions.assertTrue(str.endsWith("io"));
    }
    // This one will see if the following string DOESN'T start with La.
    @Test
    public void test3(){
        String str = "Eunie";
        System.out.println(str);
        Assertions.assertFalse(str.startsWith("La"));
    }
    // This one will observe if the following variable is null.
    @Test
    public void test4(){
        String str = null;
        System.out.println(str);
        Assertions.assertNull(str);
    }
    // This one will see if the following string isn't null.
    @Test
    public void test5(){
        String str = "I'M THE GIRL WITH THE GALL";
        System.out.println(str);
        Assertions.assertNotNull(str);
    }
}