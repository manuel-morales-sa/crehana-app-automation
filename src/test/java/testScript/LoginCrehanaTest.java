package testScript;

import baseClass.BaseClass;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;


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
        driver.launchApp();
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

    @Test
    public void userLoginValidateStructureEmail()throws Exception{
        driver.launchApp();
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        System.out.println("Login User Test Started.....");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sap.startSessionButton();
        lap.emailLoginButton();
        lcap.crehanaLoginEmailEditText("email");

        MobileElement elementStructureErrorMessage = lcap.crehanaLoginValidateEmailMessage();
        Assert.assertEquals(elementStructureErrorMessage.getText(),"Correo electrónico inválido");
        System.out.println("Successful - Test OK..." + elementStructureErrorMessage.getText());
        driver.closeApp();
    }

    @Test
    public void userLoginForgotPasswordInvalid()throws Exception{
        driver.launchApp();
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        ForgotPasswordActivityPage fpap = new ForgotPasswordActivityPage(driver);
        System.out.println("Login User Test Started.....");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sap.startSessionButton();
        lap.emailLoginButton();
        lcap.crehanaLoginForgotPasswordButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        fpap.crehanaForgotPasswordSendEmailInput("non.existent@mail.com");
        fpap.crehanaForgotPasswordButton();

        MobileElement elementToastMessage = fpap.crehanaForgotPasswordToastMessage();
        Assert.assertEquals(elementToastMessage.getText(),"No ha sido posible enviar el correo de recuperación");
        System.out.println("Successful - Test OK..." + elementToastMessage.getText());
        driver.closeApp();
    }

    @Test
    public void userLoginForgotPassword()throws Exception{
        driver.launchApp();
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        ForgotPasswordActivityPage fpap = new ForgotPasswordActivityPage(driver);
        System.out.println("Login User Test Started.....");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sap.startSessionButton();
        lap.emailLoginButton();
        lcap.crehanaLoginForgotPasswordButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        fpap.crehanaForgotPasswordSendEmailInput("automation.user@crehana.com");
        fpap.crehanaForgotPasswordButton();

        MobileElement elementToastMessage = fpap.crehanaForgotPasswordToastMessage();
        Assert.assertEquals(elementToastMessage.getText(),"Te enviamos un link para restablecer tu contraseña.");
        System.out.println("Successful - Test OK..." + elementToastMessage.getText());
        driver.closeApp();
    }

    @Test
    public void registerFieldValidation()throws Exception{
        SplashActivityPage sap = new SplashActivityPage(driver);
        LoginActivityPage lap = new LoginActivityPage(driver);
        LoginCrehanaActivityPage lcap = new LoginCrehanaActivityPage(driver);
        ForgotPasswordActivityPage fpap = new ForgotPasswordActivityPage(driver);
        RegisterWithEmail register = new RegisterWithEmail(driver);
        System.out.println("Login User Test Started.....");

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        sap.signUpButton();
        lap.emailLoginButton();

        register.crehanaRegisterEmailEditText("mail");
        MobileElement elementEmailValidateMessage = register.crehanaRegisterEmailValidateMessage();
        Assert.assertEquals(elementEmailValidateMessage.getText(),"Correo electrónico inválido");
        System.out.println("Successful - Test OK..." + elementEmailValidateMessage.getText());

        register.crehanaRegisterEmailPasswordEditText("123");
        MobileElement elementPasswordValidateMessage = register.crehanaRegisterPasswordValidateMessage();
        Assert.assertEquals(elementPasswordValidateMessage.getText(),"Las contraseña tiene que ser mayor de 6 caracteres");
        System.out.println("Successful - Test OK..." + elementPasswordValidateMessage.getText());

        register.crehanaRegisterEmailConfirmPasswordEditText("ABC");
        MobileElement elementConfirmPasswordValidateMessage = register.crehanaRegisterConfirmPasswordValidateMessage();
        Assert.assertEquals(elementConfirmPasswordValidateMessage.getText(),"Las contraseñas no coinciden");
        System.out.println("Successful - Test OK..." + elementConfirmPasswordValidateMessage.getText());

        MobileElement elementValidateTermsAndConditions = register.crehanaRegisterEmailTermsAndConditions();
        Assert.assertEquals(elementValidateTermsAndConditions.getText(),"Al registrarme, acepto los Términos, Condiciones y Políticas de Crehana.");
        System.out.println("Successful - Test OK..." + elementValidateTermsAndConditions.getText());

        driver.closeApp();
    }
}
