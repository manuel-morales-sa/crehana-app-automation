package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CoursesInscribedActivityPage extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//
    @AndroidFindBy( xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup")
    private AndroidElement courseBox;





    //Implement constructor
    public CoursesInscribedActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    //create methods to send actions

    public void courseBox() {this.courseBox.click();}

}
