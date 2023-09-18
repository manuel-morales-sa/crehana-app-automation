package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CursosInscritosActivityPage extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//
    @AndroidFindBy(id = "com.crehana.android:id/cl_container")
    private AndroidElement courseBox;





    //Implement constructor
    public CursosInscritosActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    //create methods to send actions

    public void courseBox() {this.courseBox.click();}

}
