package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import pages.BasePage;

public class ScrollAction extends BasePage {

    public ScrollAction(AppiumDriver<MobileElement> driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public void scrollElement() {
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(100000)"));
    }
}