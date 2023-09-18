package testScript;

import Utilities.ScrollAction;
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
        CursosInscritosActivityPage cia = new CursosInscritosActivityPage(driver);
        CourseDetailsActivityPage cdap = new CourseDetailsActivityPage(driver);
        ClassroomActivityPage cap = new ClassroomActivityPage(driver);


        System.out.println("Login User Test Started.....");

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
        Thread.sleep(10000);
        MobileElement element1 = cap.exoToolbar();
        boolean isDisplayed1 = element1.isDisplayed();
        Assert.assertTrue(isDisplayed1);
        System.out.println("Successful - Test OK");
        driver.closeApp();
    }
}