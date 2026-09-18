package utils;

import com.aventstack.extentreports
    .ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener
        implements ITestListener {

    private static ExtentReports extent =
        ExtentReportManager.getInstance();

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Suite started: "
            + context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest test = extent.createTest(
            result.getMethod().getMethodName(),
            result.getMethod().getDescription()
        );
        ExtentReportManager.setTest(test);
        ExtentReportManager.getTest()
            .info("Test started: "
                + result.getMethod()
                    .getMethodName());
    }

    @Override
    public void onTestSuccess(
            ITestResult result) {
        ExtentReportManager.getTest()
            .log(Status.PASS,
                "✅ Test PASSED");
    }

    @Override
    public void onTestFailure(
            ITestResult result) {
        // Take screenshot on failure
        String screenshotPath =
            ScreenshotUtils.takeScreenshot(
                result.getMethod()
                    .getMethodName());

        ExtentReportManager.getTest()
            .log(Status.FAIL,
                "❌ Test FAILED: "
                + result.getThrowable());

        // Attach screenshot
        try {
            ExtentReportManager.getTest()
                .addScreenCaptureFromPath(
                    screenshotPath,
                    "Failure Screenshot");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(
            ITestResult result) {
        ExtentReportManager.getTest()
            .log(Status.SKIP,
                "⚠️ Test SKIPPED");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
        System.out.println(
            "✅ Report generated at: "
            + "reports/TestReport.html");
    }
}