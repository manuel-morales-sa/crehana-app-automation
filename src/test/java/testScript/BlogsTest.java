package testScript;

import Utilities.ScrollAction;
import baseClass.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MobileBy;
import org.testng.annotations.Test;
import pages.*;


public class BlogsTest extends BaseClass {

    @Test
    public void userBlogs()throws Exception{
        driver.launchApp();
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        HomeActivityPage hap = new HomeActivityPage(driver);
        BlogsActivityPage bap = new BlogsActivityPage(driver);
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
        bap.crehanaSeeMoreBlogs();
        Thread.sleep(5000);
        bap.blogSectionFeedbackBox();
        Thread.sleep(5000);
        bap.blogSectionGestionDeTalentoBox();
        Thread.sleep(5000);
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
        Thread.sleep(5000);
        System.out.println("Successful - Test OK");
        driver.closeApp();
    }

}