package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ForgotPasswordActivityPage extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//

    @AndroidFindBy(id = "com.crehana.android:id/iv_back")
    public AndroidElement crehanaForgotPasswordBackButton;

    @AndroidFindBy(id = "com.crehana.android:id/title_text_view")
    public AndroidElement crehanaForgotPasswordTitle;

    @AndroidFindBy(id = "com.crehana.android:id/value_edit_text")
    public AndroidElement crehanaForgotPasswordSendEmailInput;

    @AndroidFindBy(id = "com.crehana.android:id/recover_password_button")
    public AndroidElement crehanaForgotPasswordButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.Toast")
    public AndroidElement crehanaForgotPasswordToastMessage;

    //Implement constructor
    public ForgotPasswordActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    //create methods to send actions

    public void crehanaForgotPasswordBackButton() {
        crehanaForgotPasswordBackButton.click();
    }

    public MobileElement crehanaForgotPasswordTitle() {
        crehanaForgotPasswordTitle.getText();
        return crehanaForgotPasswordTitle;
    }

    public void crehanaForgotPasswordSendEmailInput(String string) {
        crehanaForgotPasswordSendEmailInput.sendKeys(string);
    }

    public void crehanaForgotPasswordButton() {
        crehanaForgotPasswordButton.click();
    }

    public MobileElement crehanaForgotPasswordToastMessage() {
        crehanaForgotPasswordToastMessage.getText();
        return crehanaForgotPasswordToastMessage;
    }
}
