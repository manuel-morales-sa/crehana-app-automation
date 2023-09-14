package testScript;

import baseClass.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
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
        Thread.sleep(2000);

        scroll.scrollElement();
        hap.blogsButton();

        Thread.sleep(1000);

        //Elemento para hacer scroll de manera horizontal
        MobileElement categories_list = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.crehana.android:id/categories_recycler_view\"))" +
                       ".setAsHorizontalList().scrollIntoView("+ "new UiSelector().text(\"Transformación cultural\"))"));
        categories_list.click();

        Thread.sleep(6000);
        driver.closeApp();
    }

}
