package testScript;

import baseClass.BaseClass;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

public class CoursesCrehanaTest extends BaseClass {

    @Test
    public void coursesUserNotLoggedOptions() throws Exception {
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        LoginCrehanaActivityPage login_crehana = new LoginCrehanaActivityPage(driver);
        HomeActivityPage home = new HomeActivityPage(driver);
        CoursesActivityPage courses = new CoursesActivityPage(driver);
        ProfileActivityPage profile = new ProfileActivityPage(driver);
        SettingsActivityPage settings = new SettingsActivityPage(driver);
        System.out.println("Courses Test Started.....");

        Thread.sleep(1000);
        splash.startSessionButton();
        login.emailLoginButton();
        login_crehana.crehanaLoginEmailEditText("automation.user@crehana.com");
        login_crehana.crehanaLoginPasswordEditText("1234567890");
        login_crehana.crehanaLoginStartSessionButton();
        Thread.sleep(3000);

        home.navProfileButton();
        profile.profileSettingsButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        settings.settingsLogOutButton();
        settings.settingsConfirmLogOutButton();

        home.navMyCoursesButton();

        MobileElement elementCourses = courses.unloggedUserMyCourseTitle();
        boolean isDisplayed = elementCourses.isDisplayed();
        Assert.assertTrue(isDisplayed);
        System.out.println("Successful - Test OK");
        driver.closeApp();

    }

}
