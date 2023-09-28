package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ClassroomActivityPage extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//

    @AndroidFindBy(id = "com.crehana.android:id/exo_duration")
    private AndroidElement exoDuration;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Ocultar controles del reproductor\"]/android.widget.FrameLayout[4]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView[2]")
    private AndroidElement exoToolbarCheck; //Settings de player

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Ocultar controles del reproductor\"]/android.widget.FrameLayout[4]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView[2]")
    private AndroidElement exoToolbarClick; //Settings de player

    @AndroidFindBy(className = "android.widget.ImageButton")
    private AndroidElement backButtonPlayerSettings;

    @AndroidFindBy(id = "com.crehana.android:id/touch_outside")
    private AndroidElement actionTouchOutside;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]")
    private AndroidElement speedButtonPlayerSettings;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")
    private AndroidElement audioButtonPlayerSettings;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[3]")
    private AndroidElement textButtonPlayerSettings;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[4]")
    private AndroidElement qualityButtonPlayerSettings;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]")
    private AndroidElement speedButtonx05;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")
    private AndroidElement speedButtonx075;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[3]")
    private AndroidElement speedButtonx1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[4]")
    private AndroidElement speedButtonx125;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[5]")
    private AndroidElement speedButtonx15;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[6]")
    private AndroidElement speedButtonx2;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]")
    private AndroidElement audioButton1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")
    private AndroidElement audioButton2;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]")
    private AndroidElement firstSubtitle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")
    private AndroidElement secondSubtitle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[3]")
    private AndroidElement spanishSubtitle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[4]")
    private AndroidElement subtitlesOff;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]")
    private AndroidElement quality144p;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")
    private AndroidElement quality240p;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[3]")
    private AndroidElement quality360p;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[4]")
    private AndroidElement quality480p;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[5]")
    private AndroidElement quality720p;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[6]")
    private AndroidElement quality1080p;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[7]")
    private AndroidElement qualityAuto;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Retroceder 10 segundos\"]")
    private AndroidElement exoRew; //Retroceder 10 segundos

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Adelantar 10 segundos\"]")
    private AndroidElement exoFfwd; //Adelantar 10 segundos

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Mostrar controles del reproductor\"]/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.view.View")
    private AndroidElement playerControls;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout[4]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
    private AndroidElement exoFullscreen; //Tocar pantalla completa

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
    private AndroidElement exoFullscreenExit; //Salir pantalla completa

    @AndroidFindBy(id = "com.crehana.android:id/exo_play_pause")
    private AndroidElement exoPlayPause;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ImageView")
    private WebElement moreOptions;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ImageView")
    private AndroidElement downloadClass;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout")
    private AndroidElement downloadModule;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ImageView")
    private AndroidElement iconDownloadedClass;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
    private AndroidElement moduleDownloaded;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
    private AndroidElement deleteModule;

    //Implement constructor
    public ClassroomActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    //create methods to send actions
    public MobileElement exoDuration() {
        exoDuration.getText();
        return null;
    }

    public void exoToolbarClick() {
        this.exoToolbarClick.click();
    }

    public MobileElement exoToolbarCheck() {
        exoToolbarCheck.getText();
        return exoToolbarCheck;
    }

    public void actionTouchOutside() {
        this.actionTouchOutside.click();
    }

    public void backButtonPlayerSettings() {
        this.backButtonPlayerSettings.click();
    }

    public void speedButtonPlayerSettings() {
        this.speedButtonPlayerSettings.click();
    }

    public void audioButtonPlayerSettings() {
        this.audioButtonPlayerSettings.click();
    }

    public void textButtonPlayerSettings() {
        this.textButtonPlayerSettings.click();
    }

    public void qualityButtonPlayerSettings() {
        this.qualityButtonPlayerSettings.click();
    }

    public void speedButtonx05() {
        this.speedButtonx05.click();
    }

    public void speedButtonx075() {
        this.speedButtonx075.click();
    }

    public void speedButtonx1() {
        this.speedButtonx1.click();
    }

    public void speedButtonx125() {
        this.speedButtonx125.click();
    }

    public void speedButtonx15() {
        this.speedButtonx15.click();
    }

    public void speedButtonx2() {
        this.speedButtonx2.click();
    }

    public void audioButton1() {
        this.audioButton1.click();
    }

    public void audioButton2() {
        this.audioButton2.click();
    }

    public void firstSubtitle() {
        this.firstSubtitle.click();
    }

    public void secondSubtitle() {
        this.secondSubtitle.click();
    }

    public void spanishSubtitle() {
        this.spanishSubtitle.click();
    }

    public void subtitlesOff() {
        this.subtitlesOff.click();
    }

    public void quality144p() {
        this.quality144p.click();
    }

    public void quality240p() {
        this.quality240p.click();
    }

    public void quality360p() {
        this.quality360p.click();
    }

    public void quality480p() {
        this.quality480p.click();
    }

    public void quality720p() {
        this.quality720p.click();
    }

    public void quality1080p() {
        this.quality1080p.click();
    }

    public void qualityAuto() {
        this.qualityAuto.click();
    }

    public void exoRew() {
        this.exoRew.click();
    }

    public void exoFfwd() {
        this.exoFfwd.click();
    }

    public void playerControls() {
        this.playerControls.click();
    }

    public void exoPlayPause() {
        this.exoPlayPause.click();
    }

    public void exoFullscreen() {
        this.exoFullscreen.click();
    }

    public void exoFullscreenExit() {
        this.exoFullscreenExit.click();
    }

    public void moreOptions() {
        this.moreOptions.click();
    }

    public void downloadClass() {
        this.downloadClass.click();
    }

    public void downloadModule() {
        this.downloadModule.click();
    }

    public void deleteModule() {
        this.deleteModule.click();
    }

    public MobileElement iconDownloadedClass() {
        this.iconDownloadedClass.getText();
        return null;
    }

    public MobileElement moduleDownloaded() {
        this.moduleDownloaded.getText();
        return null;
    }

}