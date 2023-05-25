package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginActivityPage extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button")
    private AndroidElement emailLoginButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button")
    private AndroidElement facebookLoginButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button")
    private AndroidElement googleLoginButton;

    @AndroidFindBy(id = "com.crehana.android:id/btnSignUp")
    private AndroidElement signUpButton;

    @AndroidFindBy(id = "com.crehana.android:id/iv_back")
    private AndroidElement loginBackButton;

    @AndroidFindBy(id = "com.crehana.android:id/tvTitle")
    private AndroidElement loginTitle;

    //Implement constructor
    public LoginActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    //create methods to send actions
    public void emailLoginButton() {
        emailLoginButton.click();
    }

    public void facebookLoginButton() {
        facebookLoginButton.click();
    }

    public void signUpButton() {
        signUpButton.click();
    }

    public void loginBackButton() {
        loginBackButton.click();
    }

    public void loginTitle() {
        loginTitle.click();
    }
}
