package testScript;

import utilities.ScrollAction;
import baseClass.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MobileBy;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BlogsCrehanaTest extends BaseClass {

    @Test
    public void userBlogs() throws Exception {
        driver.launchApp();
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        LoginCrehanaActivityPage login_crehana = new LoginCrehanaActivityPage(driver);
        HomeActivityPage home = new HomeActivityPage(driver);
        BlogsActivityPage blogs = new BlogsActivityPage(driver);
        ScrollAction scroll = new ScrollAction(driver);
        System.out.println("Login User Test Started.....");

        Thread.sleep(2000);
        splash.startSessionButton();
        login.emailLoginButton();
        login_crehana.crehanaLoginEmailEditText("automation.user@crehana.com");
        login_crehana.crehanaLoginPasswordEditText("1234567890");
        login_crehana.crehanaLoginStartSessionButton();
        Thread.sleep(3000);

        scroll.scrollElement();
        scroll.scrollElement();
        scroll.scrollElement();
        scroll.scrollElement();
        blogs.crehanaSeeMoreBlogs();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        blogs.blogSectionFeedbackBox();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        blogs.blogSectionGestionDeTalentoBox();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MobileElement categories_list = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.crehana.android:id/categories_recycler_view\"))" + ".setAsHorizontalList().scrollIntoView(" + "new UiSelector().text(\"Clima laboral\"))"));
        categories_list.click();
        blogs.blogSectionClimaLaboralBox();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        blogs.blogSectionLiderazgoDeEquipoBox();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MobileElement categories_list1 = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.crehana.android:id/categories_recycler_view\"))" + ".setAsHorizontalList().scrollIntoView(" + "new UiSelector().text(\"Liderazgo de equipos\"))"));
        categories_list1.click();
        blogs.blogSectionTransformacionCulturalBox();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MobileElement categories_list2 = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.crehana.android:id/categories_recycler_view\"))" + ".setAsHorizontalList().scrollIntoView(" + "new UiSelector().text(\"Transformación digital\"))"));
        categories_list2.click();
        blogs.blogSectionTransformacionDigitalBox();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MobileElement categories_list3 = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.crehana.android:id/categories_recycler_view\"))" + ".setAsHorizontalList().scrollIntoView(" + "new UiSelector().text(\"Reclutamiento & Contratación\"))"));
        categories_list3.click();
        blogs.blogSectionReclutamientoBox();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        blogs.blogSectionNegociosBox();

        MobileElement categories_list4 = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.crehana.android:id/categories_recycler_view\"))" + ".setAsHorizontalList().scrollIntoView(" + "new UiSelector().text(\"Upskilling & Reskilling\"))"));
        categories_list4.click();
        blogs.blogSectionUpskillingReskillingBox();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        blogs.blogSectionProductReleasesBox();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MobileElement categories_list5 = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.crehana.android:id/categories_recycler_view\"))" + ".setAsHorizontalList().scrollIntoView(" + "new UiSelector().text(\"Historias de Clientes\"))"));
        categories_list5.click();
        blogs.blogSectionHistoriasDeClientesBox();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        blogs.blogSectionTrabajoRemotoBox();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MobileElement categories_list6 = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.crehana.android:id/categories_recycler_view\"))" + ".setAsHorizontalList().scrollIntoView(" + "new UiSelector().text(\"Expertos Hr\"))"));
        categories_list6.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        blogs.blogSectionEstiloDeVidaBox();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        blogs.blogSectionExpertosHrBox();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("Successful - Test OK");
        driver.closeApp();
    }

}