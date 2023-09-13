package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeActivityPage extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//
    @AndroidFindBy(id = "com.crehana.android:id/logo_image_view")
    private AndroidElement homeLogoCrehanaImage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    private AndroidElement homeCrehanaTitle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[2]")
    private AndroidElement blogsButton;

    //Implement constructor
    public HomeActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    //create methods to send actions
    public MobileElement homeLogoCrehanaImage() {
        homeLogoCrehanaImage.click();
        return homeLogoCrehanaImage;
    }

    public void homeCrehanaTitle() {
        homeCrehanaTitle.getText();
    }

    public MobileElement blogsButton() {
        blogsButton.click();
        return blogsButton;
    }
}
