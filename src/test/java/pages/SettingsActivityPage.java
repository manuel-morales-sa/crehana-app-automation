package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingsActivityPage extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//

    @AndroidFindBy(id = "com.crehana.android:id/btnLogOut")
    private AndroidElement settingsLogOutButton;

    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement settingsConfirmLogOutButton;

    @AndroidFindBy(id = "android:id/button2")
    private AndroidElement settingsCancelLogOutButton;

    public SettingsActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void settingsLogOutButton() {
        settingsLogOutButton.click();
    }

    public void settingsConfirmLogOutButton() {
        settingsConfirmLogOutButton.click();
    }

    public void settingsCancelLogOutButton() {
        settingsCancelLogOutButton.click();
    }
}
