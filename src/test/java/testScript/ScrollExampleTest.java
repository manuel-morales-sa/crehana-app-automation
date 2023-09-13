package testScript;

import baseClass.BaseClass;
import org.testng.annotations.Test;
import pages.HomeActivityPage;
import pages.LoginActivityPage;
import pages.LoginCrehanaActivityPage;
import pages.SplashActivityPage;
import utilities.ScrollAction;

public class ScrollExampleTest extends BaseClass {

    @Test
    public void userLoginSuccess()throws Exception{
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        HomeActivityPage hap = new HomeActivityPage(driver);
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
        hap.blogsButton();

        driver.closeApp();
    }

}
