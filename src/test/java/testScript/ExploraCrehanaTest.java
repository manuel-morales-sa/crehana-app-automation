package testScript;

import baseClass.BaseClass;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

public class ExploraCrehanaTest extends BaseClass {

    @Test
    public void exploraUserNotLogged() throws Exception {
        //driver.launchApp();
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        LoginCrehanaActivityPage login_crehana = new LoginCrehanaActivityPage(driver);
        HomeActivityPage home = new HomeActivityPage(driver);
        ExploraActivityPage explora = new ExploraActivityPage(driver);
        ProfileActivityPage profile = new ProfileActivityPage(driver);
        SettingsActivityPage settings = new SettingsActivityPage(driver);
        System.out.println("Login User Test Started.....");

        Thread.sleep(2000);
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

        home.navExploreButton();
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
