package testScript;

import baseClass.BaseClass;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

public class LoginCrehanaTest extends BaseClass {

    @Test
    public void userLoginSuccess() throws Exception {
        driver.launchApp();
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        LoginCrehanaActivityPage login_crehana = new LoginCrehanaActivityPage(driver);
        HomeActivityPage home = new HomeActivityPage(driver);
        System.out.println("Login User Test Started.....");

        Thread.sleep(2000);
        splash.startSessionButton();
        login.emailLoginButton();
        login_crehana.crehanaLoginEmailEditText("automation.user@crehana.com");
        login_crehana.crehanaLoginPasswordEditText("1234567890");
        login_crehana.crehanaLoginStartSessionButton();
        Thread.sleep(3000);

        MobileElement element = home.homeLogoCrehanaImage();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        System.out.println("Successful - Test OK");
        driver.closeApp();
    }

    @Test
    public void userLoginEmailIncorrect() throws Exception {
        driver.launchApp();
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        LoginCrehanaActivityPage login_crehana = new LoginCrehanaActivityPage(driver);
        System.out.println("Login User Test Started.....");

        Thread.sleep(2000);
        splash.startSessionButton();
        login.emailLoginButton();
        login_crehana.crehanaLoginEmailEditText("correo.error@crehana.com");
        login_crehana.crehanaLoginPasswordEditText("1234567890");
        login_crehana.crehanaLoginStartSessionButton();

        MobileElement elementErrorMessage = login_crehana.crehanaLoginInvalidCredentialsMessage();
        Assert.assertEquals(elementErrorMessage.getText(), "Credenciales inválidas");
        System.out.println("Successful - Test OK..." + elementErrorMessage.getText());
        driver.closeApp();
    }

    @Test
    public void userLoginPasswordIncorrect() throws Exception {
        driver.launchApp();
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        LoginCrehanaActivityPage login_crehana = new LoginCrehanaActivityPage(driver);
        System.out.println("Login User Test Started.....");

        Thread.sleep(2000);
        splash.startSessionButton();
        login.emailLoginButton();
        login_crehana.crehanaLoginEmailEditText("automation.user@crehana.com");
        login_crehana.crehanaLoginPasswordEditText("pass-error");
        login_crehana.crehanaLoginStartSessionButton();

        MobileElement elementErrorMessage = login_crehana.crehanaLoginInvalidCredentialsMessage();
        Assert.assertEquals(elementErrorMessage.getText(), "Credenciales inválidas");
        System.out.println("Successful - Test OK..." + elementErrorMessage.getText());
        driver.closeApp();
    }

    @Test
    public void userLoginValidateStructureEmail() throws Exception {
        driver.launchApp();
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        LoginCrehanaActivityPage login_crehana = new LoginCrehanaActivityPage(driver);
        System.out.println("Login User Test Started.....");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        splash.startSessionButton();
        login.emailLoginButton();
        login_crehana.crehanaLoginEmailEditText("email");

        MobileElement elementStructureErrorMessage = login_crehana.crehanaLoginValidateEmailMessage();
        Assert.assertEquals(elementStructureErrorMessage.getText(), "Correo electrónico inválido");
        System.out.println("Successful - Test OK..." + elementStructureErrorMessage.getText());
        driver.closeApp();
    }

    @Test
    public void userLoginForgotPasswordInvalid() throws Exception {
        driver.launchApp();
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        LoginCrehanaActivityPage login_crehana = new LoginCrehanaActivityPage(driver);
        ForgotPasswordActivityPage forgot_password = new ForgotPasswordActivityPage(driver);
        System.out.println("Login User Test Started.....");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        splash.startSessionButton();
        login.emailLoginButton();
        login_crehana.crehanaLoginForgotPasswordButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        forgot_password.crehanaForgotPasswordSendEmailInput("non.existent@mail.com");
        forgot_password.crehanaForgotPasswordButton();

        MobileElement elementToastMessage = forgot_password.crehanaForgotPasswordToastMessage();
        Assert.assertEquals(elementToastMessage.getText(), "No ha sido posible enviar el correo de recuperación");
        System.out.println("Successful - Test OK..." + elementToastMessage.getText());
        driver.closeApp();
    }

    @Test
    public void userLoginForgotPassword() throws Exception {
        driver.launchApp();
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        LoginCrehanaActivityPage login_crehana = new LoginCrehanaActivityPage(driver);
        ForgotPasswordActivityPage forgot_password = new ForgotPasswordActivityPage(driver);
        System.out.println("Login User Test Started.....");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        splash.startSessionButton();
        login.emailLoginButton();
        login_crehana.crehanaLoginForgotPasswordButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        forgot_password.crehanaForgotPasswordSendEmailInput("automation.user@crehana.com");
        forgot_password.crehanaForgotPasswordButton();

        MobileElement elementToastMessage = forgot_password.crehanaForgotPasswordToastMessage();
        Assert.assertEquals(elementToastMessage.getText(), "Te enviamos un link para restablecer tu contraseña.");
        System.out.println("Successful - Test OK..." + elementToastMessage.getText());
        driver.closeApp();
    }

    @Test
    public void registerFieldValidation() throws Exception {
        SplashActivityPage splash = new SplashActivityPage(driver);
        LoginActivityPage login = new LoginActivityPage(driver);
        RegisterWithEmail register = new RegisterWithEmail(driver);
        System.out.println("Login User Test Started.....");

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        splash.signUpButton();
        login.emailLoginButton();

        register.crehanaRegisterEmailEditText("mail");
        MobileElement elementEmailValidateMessage = register.crehanaRegisterEmailValidateMessage();
        Assert.assertEquals(elementEmailValidateMessage.getText(), "Correo electrónico inválido");
        System.out.println("Successful - Test OK..." + elementEmailValidateMessage.getText());

        register.crehanaRegisterEmailPasswordEditText("123");
        MobileElement elementPasswordValidateMessage = register.crehanaRegisterPasswordValidateMessage();
        Assert.assertEquals(elementPasswordValidateMessage.getText(), "Las contraseña tiene que ser mayor de 6 caracteres");
        System.out.println("Successful - Test OK..." + elementPasswordValidateMessage.getText());

        register.crehanaRegisterEmailConfirmPasswordEditText("ABC");
        MobileElement elementConfirmPasswordValidateMessage = register.crehanaRegisterConfirmPasswordValidateMessage();
        Assert.assertEquals(elementConfirmPasswordValidateMessage.getText(), "Las contraseñas no coinciden");
        System.out.println("Successful - Test OK..." + elementConfirmPasswordValidateMessage.getText());

        MobileElement elementValidateTermsAndConditions = register.crehanaRegisterEmailTermsAndConditions();
        Assert.assertEquals(elementValidateTermsAndConditions.getText(), "Al registrarme, acepto los Términos, Condiciones y Políticas de Crehana.");
        System.out.println("Successful - Test OK..." + elementValidateTermsAndConditions.getText());

        driver.closeApp();
    }
}
