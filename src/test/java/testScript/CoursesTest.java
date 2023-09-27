package testScript;

import baseClass.BaseClass;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;


public class CoursesTest extends BaseClass {

   @Test
    public void PlayerSucess()throws Exception{
        driver.launchApp();
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        HomeActivityPage hap = new HomeActivityPage(driver);
        CoursesInscribedActivityPage cia = new CoursesInscribedActivityPage(driver);
        CourseDetailsActivityPage cdap = new CourseDetailsActivityPage(driver);
        ClassroomActivityPage cap = new ClassroomActivityPage(driver);


        System.out.println("Player check Test Started.....");

        Thread.sleep(2000);
        sap.startSessionButton();
        lap.emailLoginButton();
        lcap.crehanaLoginEmailEditText("automation.user@crehana.com");
        lcap.crehanaLoginPasswordEditText("1234567890");
        lcap.crehanaLoginStartSessionButton();
        Thread.sleep(3000);

        MobileElement element = hap.homeLogoCrehanaImage();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        hap.misCursosButton();
        Thread.sleep(3000);
        cia.courseBox();
        Thread.sleep(3000);
        cdap.playButtonCourseDetails();
        Thread.sleep(7000);
        MobileElement element1 = cap.exoToolbarCheck();
        boolean isDisplayed1 = element1.isDisplayed();
        Assert.assertTrue(isDisplayed1);
        System.out.println("Successful - Test OK");
        driver.closeApp();
    }
    @Test
    public void PlayerSettings()throws Exception{
        driver.launchApp();
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        HomeActivityPage hap = new HomeActivityPage(driver);
        CoursesInscribedActivityPage cia = new CoursesInscribedActivityPage(driver);
        CourseDetailsActivityPage cdap = new CourseDetailsActivityPage(driver);
        ClassroomActivityPage cap = new ClassroomActivityPage(driver);


        System.out.println("Player settings Test Started.....");

        Thread.sleep(2000);
        sap.startSessionButton();
        lap.emailLoginButton();
        lcap.crehanaLoginEmailEditText("automation.user@crehana.com");
        lcap.crehanaLoginPasswordEditText("1234567890");
        lcap.crehanaLoginStartSessionButton();
        Thread.sleep(6000);

        MobileElement element = hap.homeLogoCrehanaImage();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        hap.misCursosButton();
        Thread.sleep(3000);
        cia.courseBox();
        Thread.sleep(3000);
        cdap.playButtonCourseDetails();
        Thread.sleep(6000);
        cap.exoToolbarClick();
        Thread.sleep(3000);

        cap.speedButtonPlayerSettings();
        Thread.sleep(2000);
        cap.speedButtonx05();
        Thread.sleep(2000);
        cap.backButtonPlayerSettings();
        Thread.sleep(2000);
        cap.speedButtonPlayerSettings();
        cap.speedButtonx075();
        Thread.sleep(2000);
        cap.backButtonPlayerSettings();
        Thread.sleep(2000);
        cap.speedButtonPlayerSettings();
        Thread.sleep(2000);
        cap.speedButtonx1();
        Thread.sleep(2000);
        cap.backButtonPlayerSettings();
        Thread.sleep(2000);
        cap.speedButtonPlayerSettings();
        Thread.sleep(2000);
        cap.speedButtonx125();
        Thread.sleep(2000);
        cap.backButtonPlayerSettings();
        Thread.sleep(2000);
        cap.speedButtonPlayerSettings();
        Thread.sleep(2000);
        cap.speedButtonx15();
        Thread.sleep(2000);
        cap.backButtonPlayerSettings();
        Thread.sleep(2000);
        cap.speedButtonPlayerSettings();
        Thread.sleep(2000);
        cap.speedButtonx2();
        cap.backButtonPlayerSettings();
        Thread.sleep(2000);

        cap.audioButtonPlayerSettings();
        Thread.sleep(2000);
        cap.audioButton1();
        Thread.sleep(2000);
        cap.backButtonPlayerSettings();
        Thread.sleep(2000);
        cap.audioButtonPlayerSettings();
        Thread.sleep(2000);
        cap.audioButton2();
        Thread.sleep(2000);

        cap.backButtonPlayerSettings();
        Thread.sleep(2000);
        cap.textButtonPlayerSettings();
        Thread.sleep(2000);
        cap.firstSubtitle();
        Thread.sleep(2000);
        cap.backButtonPlayerSettings();
        Thread.sleep(2000);
        cap.textButtonPlayerSettings();
        Thread.sleep(2000);
        cap.secondSubtitle();
        Thread.sleep(2000);

        cap.backButtonPlayerSettings();
        Thread.sleep(2000);
        cap.qualityButtonPlayerSettings();
        Thread.sleep(2000);
        cap.quality144p();
        Thread.sleep(2000);
        cap.backButtonPlayerSettings();
        Thread.sleep(2000);
        cap.qualityButtonPlayerSettings();
        Thread.sleep(2000);
        cap.quality240p();
        Thread.sleep(2000);
        cap.backButtonPlayerSettings();
        Thread.sleep(2000);
        cap.qualityButtonPlayerSettings();
        Thread.sleep(2000);
        cap.quality360p();
        Thread.sleep(2000);
        cap.backButtonPlayerSettings();
        Thread.sleep(2000);
        cap.qualityButtonPlayerSettings();
        Thread.sleep(2000);
        cap.quality480p();
        Thread.sleep(2000);
        cap.backButtonPlayerSettings();
        Thread.sleep(2000);
        cap.qualityButtonPlayerSettings();
        Thread.sleep(2000);
        cap.quality720p();
        Thread.sleep(2000);
        cap.backButtonPlayerSettings();
        Thread.sleep(2000);
        cap.qualityButtonPlayerSettings();
        Thread.sleep(2000);
        cap.quality1080p();
        Thread.sleep(2000);
        cap.backButtonPlayerSettings();
        Thread.sleep(2000);
        cap.backButtonPlayerSettings();
        Thread.sleep(2000);


        System.out.println("Successful - Test OK");
        driver.closeApp();
    }
    @Test
    public void Fullscreen()throws Exception{
        driver.launchApp();
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        HomeActivityPage hap = new HomeActivityPage(driver);
        CoursesInscribedActivityPage cia = new CoursesInscribedActivityPage(driver);
        CourseDetailsActivityPage cdap = new CourseDetailsActivityPage(driver);
        ClassroomActivityPage cap = new ClassroomActivityPage(driver);


        System.out.println("Fullscreen Test Started.....");

        Thread.sleep(2000);
        sap.startSessionButton();
        lap.emailLoginButton();
        lcap.crehanaLoginEmailEditText("automation.user@crehana.com");
        lcap.crehanaLoginPasswordEditText("1234567890");
        lcap.crehanaLoginStartSessionButton();
        Thread.sleep(6000);

        MobileElement element = hap.homeLogoCrehanaImage();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        hap.misCursosButton();
        Thread.sleep(3000);
        cia.courseBox();
        Thread.sleep(3000);
        cdap.playButtonCourseDetails();
        Thread.sleep(3000);
        cap.playerControls();
        Thread.sleep(3000);
        cap.exoPlayPause();
        Thread.sleep(3000);
        cap.exoFullscreen();
        Thread.sleep(3000);
        cap.playerControls();
        Thread.sleep(3000);
        cap.exoPlayPause();
        Thread.sleep(2000);
        cap.exoFullscreenExit();
        Thread.sleep(3000);
        cap.playerControls();
        Thread.sleep(3000);
        cap.exoPlayPause();
        Thread.sleep(3000);
        cap.exoFullscreen();
        cap.playerControls();
        Thread.sleep(3000);
        cap.exoPlayPause();
        Thread.sleep(2000);
        cap.exoFullscreenExit();
        Thread.sleep(3000);

        System.out.println("Successful - Test OK");
        driver.closeApp();

    }
    @Test
    public void DownloadClass()throws Exception{
        driver.launchApp();
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        HomeActivityPage hap = new HomeActivityPage(driver);
        CoursesInscribedActivityPage cia = new CoursesInscribedActivityPage(driver);
        CourseDetailsActivityPage cdap = new CourseDetailsActivityPage(driver);
        ClassroomActivityPage cap = new ClassroomActivityPage(driver);


        System.out.println("Download class Test Started.....");

        Thread.sleep(2000);
        sap.startSessionButton();
        lap.emailLoginButton();
        lcap.crehanaLoginEmailEditText("automation.user@crehana.com");
        lcap.crehanaLoginPasswordEditText("1234567890");
        lcap.crehanaLoginStartSessionButton();
        Thread.sleep(6000);

        MobileElement element = hap.homeLogoCrehanaImage();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        hap.misCursosButton();
        Thread.sleep(3000);
        cia.courseBox();
        Thread.sleep(3000);
        cdap.playButtonCourseDetails();
        Thread.sleep(3000);
        cap.playerControls();
        Thread.sleep(2000);
        cap.downloadClass();
        Thread.sleep(40000);

        System.out.println("Successful - Test OK");
        driver.closeApp();

    }

    @Test
    public void DownloadModule()throws Exception{
        driver.launchApp();
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        HomeActivityPage hap = new HomeActivityPage(driver);
        CoursesInscribedActivityPage cia = new CoursesInscribedActivityPage(driver);
        CourseDetailsActivityPage cdap = new CourseDetailsActivityPage(driver);
        ClassroomActivityPage cap = new ClassroomActivityPage(driver);


        System.out.println("Download Module Test Started.....");

        Thread.sleep(2000);
        sap.startSessionButton();
        lap.emailLoginButton();
        lcap.crehanaLoginEmailEditText("automation.user@crehana.com");
        lcap.crehanaLoginPasswordEditText("1234567890");
        lcap.crehanaLoginStartSessionButton();
        Thread.sleep(6000);

        MobileElement element = hap.homeLogoCrehanaImage();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        hap.misCursosButton();
        Thread.sleep(3000);
        cia.courseBox();
        Thread.sleep(3000);
        cdap.playButtonCourseDetails();
        Thread.sleep(3000);
        cap.playerControls();
        Thread.sleep(2000);
        cap.moreOptions();
        Thread.sleep(2000);
        cap.downloadModule();
        Thread.sleep(200000);

        System.out.println("Successful - Test OK");
        driver.closeApp();

    }
    @Test
    public void DeleteClass()throws Exception{
        driver.launchApp();
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        HomeActivityPage hap = new HomeActivityPage(driver);
        CoursesInscribedActivityPage cia = new CoursesInscribedActivityPage(driver);
        CourseDetailsActivityPage cdap = new CourseDetailsActivityPage(driver);
        ClassroomActivityPage cap = new ClassroomActivityPage(driver);


        System.out.println("Delete class Test Started.....");

        Thread.sleep(2000);
        sap.startSessionButton();
        lap.emailLoginButton();
        lcap.crehanaLoginEmailEditText("automation.user@crehana.com");
        lcap.crehanaLoginPasswordEditText("1234567890");
        lcap.crehanaLoginStartSessionButton();
        Thread.sleep(6000);

        MobileElement element = hap.homeLogoCrehanaImage();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        hap.misCursosButton();
        Thread.sleep(3000);
        cia.courseBox();
        Thread.sleep(3000);
        cdap.playButtonCourseDetails();
        Thread.sleep(3000);
        cap.playerControls();
        Thread.sleep(3000);
        cap.downloadClass();
        Thread.sleep(40000);
        cap.moreOptions();
        Thread.sleep(2000);
        cap.deleteModule();

        System.out.println("Successful - Test OK");
        driver.closeApp();

    }
    @Test
    public void DeleteModule()throws Exception{
        driver.launchApp();
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        HomeActivityPage hap = new HomeActivityPage(driver);
        CoursesInscribedActivityPage cia = new CoursesInscribedActivityPage(driver);
        CourseDetailsActivityPage cdap = new CourseDetailsActivityPage(driver);
        ClassroomActivityPage cap = new ClassroomActivityPage(driver);

        System.out.println("Delete Module Test Started.....");

        Thread.sleep(2000);
        sap.startSessionButton();
        lap.emailLoginButton();
        lcap.crehanaLoginEmailEditText("automation.user@crehana.com");
        lcap.crehanaLoginPasswordEditText("1234567890");
        lcap.crehanaLoginStartSessionButton();
        Thread.sleep(6000);

        MobileElement element = hap.homeLogoCrehanaImage();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        hap.misCursosButton();
        Thread.sleep(3000);
        cia.courseBox();
        Thread.sleep(3000);
        cdap.playButtonCourseDetails();
        Thread.sleep(3000);
        cap.playerControls();
        Thread.sleep(2000);
        cap.moreOptions();
        Thread.sleep(3000);
        cap.downloadModule();
        Thread.sleep(70000);
        cap.moreOptions();
        Thread.sleep(4000);
        cap.deleteModule();
        Thread.sleep(5000);

        System.out.println("Successful - Test OK");
        driver.closeApp();

    }

}