package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeActivityPage extends BasePage{

    //------------------------------------------Find selectors---------------------------------------//
    @AndroidFindBy(id = "com.crehana.android:id/logo_image_view")
    private AndroidElement homeLogoCrehanaImage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    private AndroidElement homeCrehanaTitle;

    //--------------------NavBar Elements-------------------------//

    @AndroidFindBy(id = "com.crehana.android:id/nav_home_user")
    private AndroidElement navHomeUserButton;

    @AndroidFindBy(id = "com.crehana.android:id/nav_explore")
    private AndroidElement navExploreButton;

    @AndroidFindBy(id = "com.crehana.android:id/nav_my_courses")
    private AndroidElement navMyCoursesButton;

    @AndroidFindBy(id = "com.crehana.android:id/nav_downloads")
    private AndroidElement navDownloadButton;

    @AndroidFindBy(id = "com.crehana.android:id/nav_profile")
    private AndroidElement navProfileButton;

    //Implement constructor
    public HomeActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    //create methods to send actions
    public MobileElement homeLogoCrehanaImage(){
        homeLogoCrehanaImage.click();
        return homeLogoCrehanaImage;
    }

    public void homeCrehanaTitle(){
        homeCrehanaTitle.getText();
    }

    //--------------------NavBar Methods-------------------------//
    public void navHomeUserButton() {
        navHomeUserButton.click();
    }

    public void navExploreButton() {
        navExploreButton.click();
    }

    public void navMyCoursesButton() {
        navMyCoursesButton.click();
    }

    public void navDownloadButton() {
        navDownloadButton.click();
    }

    public void navProfileButton() {
        navProfileButton.click();
    }
}
