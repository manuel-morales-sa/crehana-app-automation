package testScript;

import Utilities.ScrollAction;
import baseClass.BaseClass;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.*;

import java.util.List;


public class LivesTest extends BaseClass {

    @Test
    public void userLives()throws Exception{
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
       // aca va el scroll
        liap.crehanaSeeMoreLives();
        Thread.sleep(5000);
        liap.livesNegociosBox();
        Thread.sleep(5000);
        liap.livesIlustracionDigitalBox();
        Thread.sleep(5000); /*
        MobileElement categories_list = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.crehana.android:id/categories_recycler_view\"))" +
                        ".setAsHorizontalList().scrollIntoView("+ "new UiSelector().text(\"Clima laboral\"))"));
        categories_list.click();
        bap.blogSectionClimaLaboralBox();
        Thread.sleep(5000);
        bap.blogSectionLiderazgoDeEquipoBox();
        Thread.sleep(5000);
        MobileElement categories_list1 = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.crehana.android:id/categories_recycler_view\"))" +
                        ".setAsHorizontalList().scrollIntoView("+ "new UiSelector().text(\"Liderazgo de equipos\"))"));
        categories_list1.click();
        bap.blogSectionTransformacionCulturalBox();
        Thread.sleep(5000);
        MobileElement categories_list2 = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.crehana.android:id/categories_recycler_view\"))" +
                        ".setAsHorizontalList().scrollIntoView("+ "new UiSelector().text(\"Transformación digital\"))"));
        categories_list2.click();
        bap.blogSectionTransformacionDigitalBox();
        Thread.sleep(5000);
        MobileElement categories_list3 = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.crehana.android:id/categories_recycler_view\"))" +
                        ".setAsHorizontalList().scrollIntoView("+ "new UiSelector().text(\"Reclutamiento & Contratación\"))"));
        categories_list3.click();
        bap.blogSectionReclutamientoBox();
        Thread.sleep(5000);
        bap.blogSectionNegociosBox();
        MobileElement categories_list4 = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.crehana.android:id/categories_recycler_view\"))" +
                        ".setAsHorizontalList().scrollIntoView("+ "new UiSelector().text(\"Upskilling & Reskilling\"))"));
        categories_list4.click();
        bap.blogSectionUpskillingReskillingBox();
        Thread.sleep(5000);
        bap.blogSectionProductReleasesBox();
        Thread.sleep(5000);
        MobileElement categories_list5 = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.crehana.android:id/categories_recycler_view\"))" +
                        ".setAsHorizontalList().scrollIntoView("+ "new UiSelector().text(\"Historias de Clientes\"))"));
        categories_list5.click();
        bap.blogSectionHistoriasDeClientesBox();
        Thread.sleep(5000);
        bap.blogSectionTrabajoRemotoBox();
        Thread.sleep(5000);
        MobileElement categories_list6 = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.crehana.android:id/categories_recycler_view\"))" +
                        ".setAsHorizontalList().scrollIntoView("+ "new UiSelector().text(\"Expertos Hr\"))"));
        categories_list6.click();
        Thread.sleep(5000);
        bap.blogSectionEstiloDeVidaBox();
        Thread.sleep(5000);
        bap.blogSectionExpertosHrBox();
        Thread.sleep(5000); */
        System.out.println("Successful - Test OK");
        driver.closeApp();
    }

}