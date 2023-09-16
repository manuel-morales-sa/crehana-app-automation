package testScript;

import baseClass.BaseClass;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.ScrollAction;

import java.util.concurrent.TimeUnit;

public class ExploraCrehanaTest extends BaseClass {

    @Test
    public void exploraUserNotLogged()throws Exception{
        //driver.launchApp();
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        HomeActivityPage hap = new HomeActivityPage(driver);
        ExploraActivityPage explora = new ExploraActivityPage(driver);
        ProfileActivityPage profile = new ProfileActivityPage(driver);
        SettingsActivityPage settings = new SettingsActivityPage(driver);
        ScrollAction scroll = new ScrollAction(driver);
        System.out.println("Login User Test Started.....");

        Thread.sleep(2000);
        sap.startSessionButton();
        lap.emailLoginButton();
        lcap.crehanaLoginEmailEditText("automation.user@crehana.com");
        lcap.crehanaLoginPasswordEditText("1234567890");
        lcap.crehanaLoginStartSessionButton();
        Thread.sleep(3000);

        hap.navProfileButton();
        profile.profileSettingsButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        settings.settingsLogOutButton();
        settings.settingsConfirmLogOutButton();

        hap.navExploreButton();
        explora.exploraSearchEditText();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        explora.exploraSearchCancelButton();

        explora.exploraFirstElementList();
        explora.exploraElementBackButton();

        explora.exploraSecondElementList();
        explora.exploraElementBackButton();

        explora.exploraThirdElementList();
        explora.exploraElementBackButton();

        MobileElement elementTitle = explora.exploraTitle();
        Assert.assertEquals(elementTitle.getText(), "Explora");
        System.out.println("Successful - Test OK..." + elementTitle.getText());
        driver.closeApp();
    }
}
