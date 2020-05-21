package org.dwivedi.testng;
//Note: Once SkipException() thrown, remaining part of that test method will not be executed
// and control will goes directly to next test method execution.
import org.testng.SkipException;
import org.testng.annotations.Test;

    public class SkipExceptionTest {

        @Test
        public void skipTest(){
            String condition ="SkipTest";
            if(condition.equals("SkipTest"))
                throw new SkipException("Skipping a test-Not ready yet");
            else
                System.out.println("I am in skip test");
            System.out.println("I am out of if else condition");
        }
        @Test
        public void nonSkipTest(){
            System.out.println("No need to skip this test");
        }
    }

