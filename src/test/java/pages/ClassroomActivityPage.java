package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ClassroomActivityPage extends BasePage{

    //------------------------------------------Find selectors---------------------------------------//

    @AndroidFindBy(id = "com.crehana.android:id/exo_duration")
    private AndroidElement exoDuration;

    @AndroidFindBy(id = "com.crehana.android:id/toolbar")
    private AndroidElement exoToolbar;




    //Implement constructor
    public ClassroomActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    //create methods to send actions

    public MobileElement exoDuration(){exoDuration.getText();
        return null;
    }

    public MobileElement exoToolbar(){exoToolbar.click();
        return exoToolbar;
    }
}
