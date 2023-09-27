package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SplashActivityPage extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//
    @AndroidFindBy(id = "com.crehana.android:id/log_in_button")
    private AndroidElement startSessionButton;

    @AndroidFindBy(id = "com.crehana.android:id/sign_up_button")
    private AndroidElement signUpButton;

    @AndroidFindBy(id = "com.crehana.android:id/go_to_catalog_button")
    private AndroidElement goToCatalogButton;

    @AndroidFindBy(className = "android.widget.ImageView")
    private AndroidElement crehanaLogo;

    //Implement constructor
    public SplashActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    //create methods to send actions
    public void startSessionButton() {
        startSessionButton.click();
    }

    public void signUpButton() {
        signUpButton.click();
    }

    public void goToCatalogButton() {
        goToCatalogButton.click();
    }

    public void crehanaLogo() {
        crehanaLogo.getId();
    }

}