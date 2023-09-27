package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LivesActivityPage extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//
    @AndroidFindBy(className = "(/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[2])")
    private AndroidElement crehanaSeeMoreLives;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton")
    private AndroidElement livesSectionBackButton;

    @AndroidFindBy(xpath = "hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup")
    private AndroidElement livesNegociosBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[3]/androidx.cardview.widget.CardView/android.view.ViewGroup")
    private AndroidElement livesIlustracionDigitalBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup")
    private AndroidElement blogSectionClimaLaboralBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.view.ViewGroup")
    private AndroidElement blogSectionLiderazgoDeEquiposBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup")
    private AndroidElement blogSectionTransformacionCulturalBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement blogSectionTransformacionDigitalBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement blogSectionReclutamientoBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[3]/androidx.cardview.widget.CardView/android.view.ViewGroup")
    private AndroidElement blogSectionNegociosBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup")
    private AndroidElement blogSectionUpskillingReskillingBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[3]/androidx.cardview.widget.CardView/android.view.ViewGroup")
    private AndroidElement blogSectionProductReleasesBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup")
    private AndroidElement blogSectionHistoriasDeClientesBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup")
    private AndroidElement blogSectionTrabajoRemotoBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[3]/androidx.cardview.widget.CardView/android.view.ViewGroup")
    private AndroidElement blogSectionEstiloDeVidaBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[3]/androidx.cardview.widget.CardView/android.view.ViewGroup")
    private AndroidElement blogSectionExpertosHrBox;

    //Implement constructor
    public LivesActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    //create methods to send actions
    public void crehanaSeeMoreLives() {
        this.crehanaSeeMoreLives.click();
    }

    public void livesNegociosBox() {
        this.livesNegociosBox.click();
    }

    public void livesIlustracionDigitalBox() {
        this.livesIlustracionDigitalBox.click();
    }

}