package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CoursesActivityPage extends BasePage {
    //------------------------------------------Find selectors---------------------------------------//

    @AndroidFindBy(id = "com.crehana.android:id/tv_title")
    private AndroidElement coursesTitle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView")
    private AndroidElement coursesChatMessageIcon;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Cursos inscritos\"]")
    private AndroidElement enrolledCoursesIcon;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Rutas\"]")
    private AndroidElement learningPathsIcon;

    @AndroidFindBy(id = "com.crehana.android:id/rb_all")
    private AndroidElement contextMenuFirstElement;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]")
    private AndroidElement contextMenuSecondElement;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[3]")
    private AndroidElement contextMenuThirdElement;

    @AndroidFindBy(id = "com.crehana.android:id/tv_course_title")
    private AndroidElement titleCoursesFirstElementOnList;

    @AndroidFindBy(id = "com.crehana.android:id/pb_progress")
    private AndroidElement coursesProgressBar;

    @AndroidFindBy(id = "com.crehana.android:id/tv_progress")
    private AndroidElement coursesProgressPercentage;

    //Unlogged user elements

    @AndroidFindBy(id = "com.crehana.android:id/toolbar")
    private AndroidElement unloggedUserMyCourseTitle;

    //Implement constructor
    public CoursesActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    //create methods to send actions
    public MobileElement coursesTitle() {
        coursesTitle.getText();
        return coursesTitle;
    }

    public void coursesChatMessageIcon() {
        coursesChatMessageIcon.click();
    }

    public void enrolledCoursesIcon() {
        enrolledCoursesIcon.click();
    }

    public void learningPathsIcon() {
        learningPathsIcon.click();
    }

    public void contextMenuFirstElement() {
        contextMenuFirstElement.click();
    }

    public void contextMenuSecondElement() {
        contextMenuSecondElement.click();
    }

    public void contextMenuThirdElement() {
        contextMenuThirdElement.click();
    }

    public MobileElement titleCoursesFirstElementOnList() {
        titleCoursesFirstElementOnList.getText();
        return titleCoursesFirstElementOnList;
    }

    public MobileElement CoursesProgressBar() {
        coursesProgressBar.getText();
        return coursesProgressBar;
    }

    public MobileElement CoursesProgressPercentage() {
        coursesProgressPercentage.getText();
        return coursesProgressPercentage;
    }

    public MobileElement unloggedUserMyCourseTitle() {
        unloggedUserMyCourseTitle.getText();
        return unloggedUserMyCourseTitle;
    }

}