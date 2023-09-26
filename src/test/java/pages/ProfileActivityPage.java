package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfileActivityPage extends BasePage{

    //------------------------------------------Find selectors---------------------------------------//

    @AndroidFindBy(id = "com.crehana.android:id/settings_image_view")
    private AndroidElement profileSettingsButton;

    public ProfileActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void profileSettingsButton(){
        profileSettingsButton.click();
    }


}
