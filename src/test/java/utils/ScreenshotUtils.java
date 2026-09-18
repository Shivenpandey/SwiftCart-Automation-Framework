package utils;

import base.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {

    public static String takeScreenshot(
            String testName) {
        String timestamp =
            new SimpleDateFormat("yyyyMMdd_HHmmss")
                .format(new Date());

        String path = "reports/screenshots/"
            + testName + "_"
            + timestamp + ".png";

        try {
            File src = ((TakesScreenshot)
                DriverFactory.getDriver())
                .getScreenshotAs(OutputType.FILE);

            File dest = new File(path);
            dest.getParentFile().mkdirs();
            FileUtils.copyFile(src, dest);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return path;
    }
}