package org.dwivedi.dependsOn;

import org.testng.annotations.Test;

public class DependsOnMethodsTestCase {
    @Test(dependsOnMethods ="testcase_2")
    public void testcase_1(){
        System.out.println("TestCase1");
    }

    @Test
    public void testcase_2(){
        System.out.println("TestCase2");
    }
}
