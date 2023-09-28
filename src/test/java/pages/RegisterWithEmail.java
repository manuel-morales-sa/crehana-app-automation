package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegisterWithEmail extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//
    @AndroidFindBy(id = "com.crehana.android:id/iv_back")
    private AndroidElement crehanaRegisterEmailBackButton;

    @AndroidFindBy(id = "com.crehana.android:id/tvTitle")
    private AndroidElement crehanaRegisterEmailTitle;

    @AndroidFindBy(id = "com.crehana.android:id/etEmail")
    private AndroidElement crehanaRegisterEmailEditText;

    @AndroidFindBy(id = "com.crehana.android:id/etPassword")
    private AndroidElement crehanaRegisterEmailPasswordEditText;

    @AndroidFindBy(id = "com.crehana.android:id/etPasswordConfirm")
    private AndroidElement crehanaRegisterEmailConfirmPasswordEditText;

    @AndroidFindBy(id = "com.crehana.android:id/tvTerms")
    private AndroidElement crehanaRegisterEmailTermsAndConditions;

    @AndroidFindBy(id = "com.crehana.android:id/btnSignUp")
    private AndroidElement crehanaRegisterEmailButton;

    @AndroidFindBy(id = "com.crehana.android:id/textinput_error")
    private AndroidElement crehanaRegisterEmailValidateMessage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
    private AndroidElement crehanaRegisterPasswordValidateMessage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
    private AndroidElement crehanaRegisterConfirmPasswordValidateMessage;


    public RegisterWithEmail(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void crehanaRegisterEmailBackButton() {
        crehanaRegisterEmailBackButton.click();
    }

    public MobileElement crehanaRegisterEmailTitle() {
        crehanaRegisterEmailTitle.getText();
        return crehanaRegisterEmailTitle;
    }

    public void crehanaRegisterEmailEditText(String string) {
        crehanaRegisterEmailEditText.sendKeys(string);
    }

    public void crehanaRegisterEmailPasswordEditText(String string) {
        crehanaRegisterEmailPasswordEditText.sendKeys(string);
    }

    public void crehanaRegisterEmailConfirmPasswordEditText(String string) {
        crehanaRegisterEmailConfirmPasswordEditText.sendKeys(string);
    }

    public MobileElement crehanaRegisterEmailTermsAndConditions() {
        crehanaRegisterEmailTermsAndConditions.getText();
        return crehanaRegisterEmailTermsAndConditions;
    }

    public void crehanaRegisterEmailButton() {
        crehanaRegisterEmailButton.click();
    }

    public MobileElement crehanaRegisterEmailValidateMessage() {
        crehanaRegisterEmailValidateMessage.getText();
        return crehanaRegisterEmailValidateMessage;
    }

    public MobileElement crehanaRegisterPasswordValidateMessage() {
        crehanaRegisterPasswordValidateMessage.getText();
        return crehanaRegisterPasswordValidateMessage;
    }

    public MobileElement crehanaRegisterConfirmPasswordValidateMessage() {
        crehanaRegisterConfirmPasswordValidateMessage.getText();
        return crehanaRegisterConfirmPasswordValidateMessage;
    }
}
