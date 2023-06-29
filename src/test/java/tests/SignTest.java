package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class SignTest {
    @Test
    public void testFazerLoginNoSoucedemo() {
        System.setProperty("webdriver.chrome.driver", "D:\\Ale -Curso\\Driver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.get("https://saucedemo.com");


        navegador.findElement(By.id("login_button_container")).findElement(By.name("user-name")).sendKeys("standard_user");
        navegador.findElement(By.id("login_button_container")).findElement(By.name("password")).sendKeys("secret_sauce");

        navegador.findElement(By.id("login-button")).click();

        String swagLabs = navegador.findElement(By.className("app_logo")).getText();

        assertEquals("Swag Labs", swagLabs);

        navegador.quit();

    }

    @Test
    public void testFazerLoginNoSaucedemo2() {
        System.setProperty("webdriver.chrome.driver", "D:\\Ale -Curso\\Driver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.get("https://saucedemo.com");


        navegador.findElement(By.id("login_button_container")).findElement(By.name("user-name")).sendKeys("locked_out_user");
        navegador.findElement(By.id("login_button_container")).findElement(By.name("password")).sendKeys("secret_sauce");

        navegador.findElement(By.id("login-button")).click();

        String swagLabs = navegador.findElement(By.className("app_logo")).getText();

        assertEquals("Swag Labs", swagLabs);

        navegador.quit();

    }

    @Test
    public void testFazerLoginNoSaucedemo3() {
        System.setProperty("webdriver.chrome.driver", "D:\\Ale -Curso\\Driver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.get("https://saucedemo.com");


        navegador.findElement(By.id("login_button_container")).findElement(By.name("user-name")).sendKeys("problem_user");
        navegador.findElement(By.id("login_button_container")).findElement(By.name("password")).sendKeys("secret_sauce");

        navegador.findElement(By.id("login-button")).click();

        String swagLabs = navegador.findElement(By.className("app_logo")).getText();

        assertEquals("Swag Labs", swagLabs);

        navegador.quit();

    }

    @Test
    public void testFazerLoginNoSaucedemo4() {
        System.setProperty("webdriver.chrome.driver", "D:\\Ale -Curso\\Driver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.get("https://saucedemo.com");


        navegador.findElement(By.id("login_button_container")).findElement(By.name("user-name")).sendKeys("performance_glitch_user");
        navegador.findElement(By.id("login_button_container")).findElement(By.name("password")).sendKeys("secret_sauce");

        navegador.findElement(By.id("login-button")).click();

        String swagLabs = navegador.findElement(By.className("app_logo")).getText();

        assertEquals("Swag Labs", swagLabs);

        navegador.quit();

    }
}
