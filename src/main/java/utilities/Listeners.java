package utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class Listeners extends CommonOps implements ITestListener {

    public void onStart(ITestContext execution) {
        System.out.println("--------------Starting Execution---------------");

    }

    public void onFinish(ITestContext execution) {
        System.out.println("--------------Ending Execution---------------");

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    public void onTestSkipped(ITestResult test) {
        System.out.println("--------------Skipping Test: "+test.getName()+"--------------");

    }

    public void onTestStart(ITestResult test) {
        System.out.println("--------------Starting Test: "+test.getName()+"--------------");

    }
    /*
    ###################################################################################
    Method name: onTestSuccess
    Method description: This method stop and delete the recording
    ###################################################################################
     */
    public void onTestSuccess(ITestResult test) {
        System.out.println("--------------Test: " + test.getName() + " Passed--------------");

            // Stop Recording
            try {
                MonteScreenRecorder.stopRecord();
            } catch (Exception e) {
                e.printStackTrace();
            }
            // Delete Recorded File
            File file = new File("./test-recordings/" + test.getName() + ".avi");
            if (file.delete())
                System.out.println("File Deleted Successfully");
            else
                System.out.println("Failed to Delete File");
    }
    /*
    ###################################################################################
    Method name: onTestFailure
    Method description: This method stop the recording and saves a screenshot
    ###################################################################################
     */
    public void onTestFailure(ITestResult test) {
        System.out.println("--------------Test: "+test.getName()+" Failed--------------");

            // Stop Recording
            try {
                MonteScreenRecorder.stopRecord();
            } catch (Exception e) {
                e.printStackTrace();
            }
            saveScreenshot();
    }
    /*
    ###################################################################################
    Method name: saveScreenshot
    Method description: This method save a screenshot
    Method Return: byte[]
    ###################################################################################
     */
    @Attachment(value = "page screenshot", type = "image/png")
    public byte[] saveScreenshot(){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}