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

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        splash.startSessionButton();
        login.emailLoginButton();
        login_crehana.crehanaLoginEmailEditText("automation.user@crehana.com");
        login_crehana.crehanaLoginPasswordEditText("1234567890");
        login_crehana.crehanaLoginStartSessionButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

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

    @Test
    public void playerSuccess() throws Exception {
        driver.launchApp();
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        LoginCrehanaActivityPage login_crehana = new LoginCrehanaActivityPage(driver);
        HomeActivityPage home = new HomeActivityPage(driver);
        CoursesInscribedActivityPage courses_inscribed = new CoursesInscribedActivityPage(driver);
        CourseDetailsActivityPage course_details = new CourseDetailsActivityPage(driver);
        ClassroomActivityPage classroom = new ClassroomActivityPage(driver);
        System.out.println("Player check Test Started.....");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        splash.startSessionButton();
        login.emailLoginButton();
        login_crehana.crehanaLoginEmailEditText("automation.user@crehana.com");
        login_crehana.crehanaLoginPasswordEditText("1234567890");
        login_crehana.crehanaLoginStartSessionButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        MobileElement element = home.homeLogoCrehanaImage();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        home.navMyCoursesButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        courses_inscribed.courseBox();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        course_details.playButtonCourseDetails();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MobileElement element1 = classroom.exoToolbarCheck();
        boolean isDisplayed1 = element1.isDisplayed();
        Assert.assertTrue(isDisplayed1);
        System.out.println("Successful - Test OK");
        driver.closeApp();
    }

    @Test
    public void playerSettings() throws Exception {
        driver.launchApp();
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        LoginCrehanaActivityPage login_crehana = new LoginCrehanaActivityPage(driver);
        HomeActivityPage home = new HomeActivityPage(driver);
        CoursesInscribedActivityPage courses_inscribed = new CoursesInscribedActivityPage(driver);
        CourseDetailsActivityPage course_details = new CourseDetailsActivityPage(driver);
        ClassroomActivityPage classroom = new ClassroomActivityPage(driver);
        System.out.println("Player settings Test Started.....");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        splash.startSessionButton();
        login.emailLoginButton();
        login_crehana.crehanaLoginEmailEditText("automation.user@crehana.com");
        login_crehana.crehanaLoginPasswordEditText("1234567890");
        login_crehana.crehanaLoginStartSessionButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        MobileElement element = home.homeLogoCrehanaImage();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        home.navMyCoursesButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        courses_inscribed.courseBox();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        course_details.playButtonCourseDetails();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.exoToolbarClick();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        classroom.speedButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.speedButtonx05();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.speedButtonPlayerSettings();
        classroom.speedButtonx075();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.speedButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.speedButtonx1();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.speedButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.speedButtonx125();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.speedButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.speedButtonx15();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.speedButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.speedButtonx2();
        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        classroom.audioButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.audioButton1();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.audioButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.audioButton2();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.textButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.firstSubtitle();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.textButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.secondSubtitle();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.qualityButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.quality144p();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.qualityButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.quality240p();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.qualityButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.quality360p();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.qualityButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.quality480p();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.qualityButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.quality720p();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.qualityButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.quality1080p();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.backButtonPlayerSettings();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        System.out.println("Successful - Test OK");
        driver.closeApp();
    }

    @Test
    public void fullscreen() throws Exception {
        driver.launchApp();
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        LoginCrehanaActivityPage login_crehana = new LoginCrehanaActivityPage(driver);
        HomeActivityPage home = new HomeActivityPage(driver);
        CoursesInscribedActivityPage courses_inscribed = new CoursesInscribedActivityPage(driver);
        CourseDetailsActivityPage course_details = new CourseDetailsActivityPage(driver);
        ClassroomActivityPage classroom = new ClassroomActivityPage(driver);
        System.out.println("Fullscreen Test Started.....");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        splash.startSessionButton();
        login.emailLoginButton();
        login_crehana.crehanaLoginEmailEditText("automation.user@crehana.com");
        login_crehana.crehanaLoginPasswordEditText("1234567890");
        login_crehana.crehanaLoginStartSessionButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        MobileElement element = home.homeLogoCrehanaImage();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        home.navMyCoursesButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        courses_inscribed.courseBox();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        course_details.playButtonCourseDetails();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.playerControls();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.exoPlayPause();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.exoFullscreen();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.playerControls();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.exoPlayPause();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.exoFullscreenExit();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.playerControls();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.exoPlayPause();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.exoFullscreen();
        classroom.playerControls();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.exoPlayPause();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.exoFullscreenExit();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        System.out.println("Successful - Test OK");
        driver.closeApp();

    }

    @Test
    public void downloadClass() throws Exception {
        driver.launchApp();
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        LoginCrehanaActivityPage login_crehana = new LoginCrehanaActivityPage(driver);
        HomeActivityPage home = new HomeActivityPage(driver);
        CoursesInscribedActivityPage courses_inscribed = new CoursesInscribedActivityPage(driver);
        CourseDetailsActivityPage course_details = new CourseDetailsActivityPage(driver);
        ClassroomActivityPage classroom = new ClassroomActivityPage(driver);
        System.out.println("Download class Test Started.....");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        splash.startSessionButton();
        login.emailLoginButton();
        login_crehana.crehanaLoginEmailEditText("automation.user@crehana.com");
        login_crehana.crehanaLoginPasswordEditText("1234567890");
        login_crehana.crehanaLoginStartSessionButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        MobileElement element = home.homeLogoCrehanaImage();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        home.navMyCoursesButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        courses_inscribed.courseBox();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        course_details.playButtonCourseDetails();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.playerControls();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.downloadClass();
        Thread.sleep(40000);

        System.out.println("Successful - Test OK");
        driver.closeApp();

    }

    @Test
    public void downloadModule() throws Exception {
        driver.launchApp();
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        LoginCrehanaActivityPage login_crehana = new LoginCrehanaActivityPage(driver);
        HomeActivityPage home = new HomeActivityPage(driver);
        CoursesInscribedActivityPage courses_inscribed = new CoursesInscribedActivityPage(driver);
        CourseDetailsActivityPage course_details = new CourseDetailsActivityPage(driver);
        ClassroomActivityPage classroom = new ClassroomActivityPage(driver);
        System.out.println("Download Module Test Started.....");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        splash.startSessionButton();
        login.emailLoginButton();
        login_crehana.crehanaLoginEmailEditText("automation.user@crehana.com");
        login_crehana.crehanaLoginPasswordEditText("1234567890");
        login_crehana.crehanaLoginStartSessionButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        MobileElement element = home.homeLogoCrehanaImage();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        home.navMyCoursesButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        courses_inscribed.courseBox();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        course_details.playButtonCourseDetails();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.playerControls();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.moreOptions();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.downloadModule();
        Thread.sleep(200000);

        System.out.println("Successful - Test OK");
        driver.closeApp();

    }

    @Test
    public void deleteClass() throws Exception {
        driver.launchApp();
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        LoginCrehanaActivityPage login_crehana = new LoginCrehanaActivityPage(driver);
        HomeActivityPage home = new HomeActivityPage(driver);
        CoursesInscribedActivityPage courses_inscribed = new CoursesInscribedActivityPage(driver);
        CourseDetailsActivityPage course_details = new CourseDetailsActivityPage(driver);
        ClassroomActivityPage classroom = new ClassroomActivityPage(driver);
        System.out.println("Delete class Test Started.....");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        splash.startSessionButton();
        login.emailLoginButton();
        login_crehana.crehanaLoginEmailEditText("automation.user@crehana.com");
        login_crehana.crehanaLoginPasswordEditText("1234567890");
        login_crehana.crehanaLoginStartSessionButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        MobileElement element = home.homeLogoCrehanaImage();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        home.navMyCoursesButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        courses_inscribed.courseBox();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        course_details.playButtonCourseDetails();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.playerControls();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.downloadClass();
        Thread.sleep(40000);
        classroom.moreOptions();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.deleteModule();

        System.out.println("Successful - Test OK");
        driver.closeApp();

    }

    @Test
    public void deleteModule() throws Exception {
        driver.launchApp();
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        LoginCrehanaActivityPage login_crehana = new LoginCrehanaActivityPage(driver);
        HomeActivityPage home = new HomeActivityPage(driver);
        CoursesInscribedActivityPage courses_inscribed = new CoursesInscribedActivityPage(driver);
        CourseDetailsActivityPage course_details = new CourseDetailsActivityPage(driver);
        ClassroomActivityPage classroom = new ClassroomActivityPage(driver);
        System.out.println("Delete Module Test Started.....");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        splash.startSessionButton();
        login.emailLoginButton();
        login_crehana.crehanaLoginEmailEditText("automation.user@crehana.com");
        login_crehana.crehanaLoginPasswordEditText("1234567890");
        login_crehana.crehanaLoginStartSessionButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        MobileElement element = home.homeLogoCrehanaImage();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        home.navMyCoursesButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        courses_inscribed.courseBox();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        course_details.playButtonCourseDetails();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.playerControls();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.moreOptions();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.downloadModule();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.moreOptions();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        classroom.deleteModule();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        System.out.println("Successful - Test OK");
        driver.closeApp();

    }

}