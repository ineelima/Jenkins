package org.dwivedi.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

    public void onStart(ITestContext context){
        System.out.println("Start test execution -----" + context.getName());
    }
    public void onFinish(ITestContext context){
        System.out.println("Finish test execution -----" + context.getName());
    }
    public void onTestStart(ITestResult result){
        System.out.println("TestStarted Successfully"+ result.getName());

    }
    public void onTestSkipped(ITestResult result){
        System.out.println("TestSkipped Successfully"+ result.getName());
    }
    public void onTestFailure(ITestResult result){
        System.out.println("Test Failed"+ result.getName());
    }
    public void onTestSuccess(ITestResult result){
        System.out.println("TestPassed Successfully"+ result.getName());
    }
    public void onTestFailedWithSuccessPercentage(ITestResult result){
        System.out.println("TestPassed Successfully With Percetage"+ result.getName());
    }

}
