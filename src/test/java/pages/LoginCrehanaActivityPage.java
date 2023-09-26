package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginCrehanaActivityPage extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//
    @AndroidFindBy(id = "com.crehana.android:id/back_image_view")
    private AndroidElement crehanaLoginBackButton;

    @AndroidFindBy(id = "com.crehana.android:id/title_text_view")
    private AndroidElement crehanaLoginTitle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.cardview.widget.CardView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private AndroidElement crehanaLoginEmailEditText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/androidx.cardview.widget.CardView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private AndroidElement crehanaLoginPasswordEditText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.Button")
    private AndroidElement crehanaLoginStartSessionButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.Button")
    private AndroidElement crehanaLoginForgotPasswordButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/androidx.cardview.widget.CardView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
    private AndroidElement crehanaLoginInvalidCredentialsMessage;

    @AndroidFindBy(id = "com.crehana.android:id/textinput_error")
    private AndroidElement crehanaLoginValidateEmailMessage;

    //Implement constructor
    public LoginCrehanaActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    //create methods to send actions
    public void crehanaLoginBackButton() {
        crehanaLoginBackButton.click();
    }

    public void crehanaLoginTitle() {
        crehanaLoginTitle.click();
    }

    public void crehanaLoginEmailEditText(String string) {
        crehanaLoginEmailEditText.sendKeys(string);
    }

    public void crehanaLoginPasswordEditText(String string) {
        crehanaLoginPasswordEditText.sendKeys(string);
    }

    public void crehanaLoginStartSessionButton() {
        crehanaLoginStartSessionButton.click();
    }

    public void crehanaLoginForgotPasswordButton() {
        crehanaLoginForgotPasswordButton.click();
    }

    public MobileElement crehanaLoginInvalidCredentialsMessage() {
        crehanaLoginInvalidCredentialsMessage.getText();
        return crehanaLoginInvalidCredentialsMessage;
    }

    public MobileElement crehanaLoginValidateEmailMessage(){
        crehanaLoginValidateEmailMessage.getText();
        return crehanaLoginValidateEmailMessage;
    }

}
