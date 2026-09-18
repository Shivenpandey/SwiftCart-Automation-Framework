package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports
    .reporter.ExtentSparkReporter;
import com.aventstack.extentreports
    .reporter.configuration.Theme;

public class ExtentReportManager {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test
        = new ThreadLocal<>();

    public static ExtentReports getInstance() {
        if (extent == null) {
            ExtentSparkReporter spark =
                new ExtentSparkReporter(
                    "reports/TestReport.html");

            spark.config().setReportName(
                "eCommerce Automation Report");
            spark.config().setDocumentTitle(
                "Test Execution Results");
            spark.config().setTheme(Theme.DARK);
            spark.config().setEncoding("utf-8");

            extent = new ExtentReports();
            extent.attachReporter(spark);

            extent.setSystemInfo(
                "Application", "SauceDemo");
            extent.setSystemInfo(
                "Environment", "QA");
            extent.setSystemInfo(
                "Browser", "Chrome");
            extent.setSystemInfo(
                "Tester", "Shiven Pandey");
            extent.setSystemInfo(
                "Framework",
                "Selenium + Java + TestNG");
        }
        return extent;
    }

    public static ExtentTest getTest() {
        return test.get();
    }

    public static void setTest(
            ExtentTest extentTest) {
        test.set(extentTest);
    }
}