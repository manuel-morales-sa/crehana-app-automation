package testScript;

import baseClass.BaseClass;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomeActivityPage;
import pages.LoginActivityPage;
import pages.LoginCrehanaActivityPage;
import pages.SplashActivityPage;


public class LoginCrehanaTest extends BaseClass {

    @Test
    public void userLoginSuccess()throws Exception{
        driver.launchApp();
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        HomeActivityPage hap = new HomeActivityPage(driver);
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
        System.out.println("Successful - Test OK");
        driver.closeApp();
    }

    @Test
    public void userLoginEmailIncorrect()throws Exception{
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        HomeActivityPage hap = new HomeActivityPage(driver);
        System.out.println("Login User Test Started.....");

        Thread.sleep(2000);
        sap.startSessionButton();
        lap.emailLoginButton();
        lcap.crehanaLoginEmailEditText("correo.error@crehana.com");
        lcap.crehanaLoginPasswordEditText("1234567890");
        lcap.crehanaLoginStartSessionButton();

        MobileElement elementErrorMessage = lcap.crehanaLoginInvalidCredentialsMessage();
        Assert.assertEquals(elementErrorMessage.getText(), "Credenciales inválidas");
        System.out.println("Successful - Test OK..." + elementErrorMessage.getText());
        driver.closeApp();
    }

    @Test
    public void userLoginPasswordIncorrect()throws Exception{
        driver.launchApp();
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        HomeActivityPage hap = new HomeActivityPage(driver);
        System.out.println("Login User Test Started.....");

        Thread.sleep(2000);
        sap.startSessionButton();
        lap.emailLoginButton();
        lcap.crehanaLoginEmailEditText("automation.user@crehana.com");
        lcap.crehanaLoginPasswordEditText("pass-error");
        lcap.crehanaLoginStartSessionButton();

        MobileElement elementErrorMessage = lcap.crehanaLoginInvalidCredentialsMessage();
        Assert.assertEquals(elementErrorMessage.getText(),"Credenciales inválidas");
        System.out.println("Successful - Test OK..." + elementErrorMessage.getText());
        driver.closeApp();
    }
}
