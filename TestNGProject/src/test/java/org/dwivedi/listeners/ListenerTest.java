package org.dwivedi.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

//@Listeners(org.dwivedi.listeners.CustomListeners.class)
public class ListenerTest {
    @Test
    public void testCase1() {
        System.out.println("testCase1");
        Assert.assertEquals("A","A");
    }

    //@Test
    public void testCase2(){
        System.out.println("testCase2");
        Assert.assertEquals("A","B");

    }

    @Test
    public void testCase3(){
        System.out.println("testCase3");
        throw new SkipException("this is the skipped test...");
    }
}
