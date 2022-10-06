package Login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class CommonSteps {
    public void loginSignup() {
        WebDriverManager.chromedriver().setup();
        /* TO DISABLE POP WINDOWS
        ChromeOptions opt = new ChromeOptions();

        opt.setExperimentalOption("excludeSwitches" , Arrays.asList("disable-popup-blocking"));
        WebDriver driver = new ChromeDriver(opt);*/
        WebDriver driver = new ChromeDriver();
//Go to signup page
        driver.get("https://sndvaranasi.in/signup");
driver.findElement(By.cssSelector("div#__next > div > div > div > form > label > input")).sendKeys("test");
driver.findElement(By.cssSelector("div#__next > div > div > div > form > label:nth-of-type(2) > input")).sendKeys("test@gmail.com");
driver.findElement(By.cssSelector("div#__next > div > div > div > form > label:nth-of-type(3) > input")).sendKeys("test@12345");
driver.findElement(By.cssSelector("div#__next > div > div > div > form > label:nth-of-type(4) > input")).sendKeys("7838952924");
driver.findElement(By.cssSelector("div#__next > div > div > div > form > label:nth-of-type(5) > input")).sendKeys("mytestingcompany");
driver.findElement(By.cssSelector("div#__next > div > div > div > form > label:nth-of-type(6) > input")).sendKeys("aamygst7716gste");
driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/form/div/button")).click();
        /*Click on Login
        driver.findElement(By.cssSelector("div#__next > div > div > div > form > div > p:nth-of-type(2)")).click();
        //enter email
        driver.findElement(By.cssSelector("div#__next > div > div > div:nth-of-type(2) > div > form > label > input")).sendKeys("testcodeword@gmail.com");
        //enter password
        driver.findElement(By.cssSelector("div#__next > div > div > div:nth-of-type(2) > div > form > label:nth-of-type(2) > input")).sendKeys("code@12345");
        //click on Login button
        driver.findElement(By.cssSelector("div#__next > div > div > div:nth-of-type(2) > div > form > div > button")).click();

        //driver.manage().timeouts().implicitlyWait (50, TimeUnit.SECONDS);
        //driver.findElement(By.css Selector("div#headlessui-dialog-7 > div > div:nth-of-type(2) > div:nth-of-type(2) > div > a")).click();*/
    }

    public static void main(String[] args) {
        CommonSteps run = new CommonSteps();
        run.loginSignup();
    }
}


