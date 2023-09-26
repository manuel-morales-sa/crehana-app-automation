package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ExploraActivityPage extends BasePage{

    //------------------------------------------Find selectors---------------------------------------//

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement exploraTitle;

    @AndroidFindBy(id = "com.crehana.android:id/searchBarContainer")
    private AndroidElement exploraSearchEditText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.widget.ImageView")
    private AndroidElement exploraFirstElementList;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.widget.ImageView")
    private AndroidElement exploraSecondElementList;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/androidx.cardview.widget.CardView/android.widget.ImageView")
    private AndroidElement exploraThirdElementList;

    @AndroidFindBy(id = "com.crehana.android:id/iv_category_view_more")
    private AndroidElement exploraViewMore;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.ImageView[2]")
    private AndroidElement exploraCommunityBlog;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.ImageView[2]")
    private AndroidElement exploraCommunityLives;

    @AndroidFindBy(id = "com.crehana.android:id/btn_cancel")
    private AndroidElement exploraSearchCancelButton;

    @AndroidFindBy(id = "com.crehana.android:id/back_image_view")
    private AndroidElement exploraElementBackButton;

    public ExploraActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public MobileElement exploraTitle(){
        exploraTitle.getText();
        return exploraTitle;
    }

    public void exploraSearchEditText() {
        exploraSearchEditText.click();
    }

    public void exploraFirstElementList() {
        exploraFirstElementList.click();
    }

    public void exploraSecondElementList() {
        exploraSecondElementList.click();
    }

    public void exploraThirdElementList() {
        exploraThirdElementList.click();
    }

    public void exploraViewMore(){
        exploraViewMore.click();
    }

    public void exploraCommunityBlog() {
        exploraCommunityBlog.click();
    }

    public void exploraCommunityLives() {
        exploraCommunityLives.click();
    }

    public void exploraSearchCancelButton(){
        exploraSearchCancelButton.click();
    }

    public void exploraElementBackButton(){
        exploraElementBackButton.click();
    }
}
