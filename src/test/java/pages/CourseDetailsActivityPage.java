package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CourseDetailsActivityPage extends BasePage{

    //------------------------------------------Find selectors---------------------------------------//
    @AndroidFindBy(id = "com.crehana.android:id/iv_play")
    private AndroidElement playButtonCourseDetails;

    //Implement constructor
    public CourseDetailsActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    //create methods to send actions
    public void playButtonCourseDetails() {this.playButtonCourseDetails.click();}

}
