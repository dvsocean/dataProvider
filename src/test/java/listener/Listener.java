package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {


    public void onTestStart(ITestResult iTestResult) {

    }
    
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("YAYA WE PASSEED!!" + iTestResult.getName());
    }

    public void onTestFailure(ITestResult iTestResult) {

    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
