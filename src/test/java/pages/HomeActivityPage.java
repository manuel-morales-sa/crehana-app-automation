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
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Inicio\"]/android.widget.ImageView")
    private AndroidElement homeButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Explora\"]/android.widget.ImageView")
    private AndroidElement exploraButton;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Mis cursos\"]/android.widget.ImageView")
    private AndroidElement misCursosButton;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Descargas\"]/android.widget.ImageView")
    private AndroidElement descargasButton;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Perfil\"]/android.widget.ImageView")
    private AndroidElement perfilButton;

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

    public void homeButton() {
        this.homeButton.click();
    }
    public void exploraButton() {
        this.exploraButton.click();
    }
    public void misCursosButton() {
        this.misCursosButton.click();
    }
    public void descargasButton() {
        this.descargasButton.click();
    }
    public void perfilButton() {
        this.perfilButton.click();
    }
}
