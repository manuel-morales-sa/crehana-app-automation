package testScript;

import utilities.ScrollAction;
import baseClass.BaseClass;
import org.testng.annotations.Test;
import pages.*;

public class LivesCrehanaTest extends BaseClass {

    @Test
    public void userLives() throws Exception {
        driver.launchApp();
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        HomeActivityPage hap = new HomeActivityPage(driver);
        LivesActivityPage liap = new LivesActivityPage(driver);
        ScrollAction scroll = new ScrollAction(driver);
        System.out.println("Login User Test Started.....");

        Thread.sleep(2000);
        sap.startSessionButton();
        lap.emailLoginButton();
        lcap.crehanaLoginEmailEditText("automation.user@crehana.com");
        lcap.crehanaLoginPasswordEditText("1234567890");
        lcap.crehanaLoginStartSessionButton();
        Thread.sleep(3000);

        scroll.scrollElement();
        scroll.scrollElement();
        scroll.scrollElement();
        scroll.scrollElement();
        liap.crehanaSeeMoreLives();
        Thread.sleep(5000);
        liap.livesNegociosBox();
        Thread.sleep(5000);
        liap.livesIlustracionDigitalBox();
        Thread.sleep(5000);

        System.out.println("Successful - Test OK");
        driver.closeApp();
    }

}