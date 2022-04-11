package project_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ComUtimateqa {

    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        System.out.println("PAGE TITLE : " + driver.getTitle());
        System.out.println("CURRENT URL : " + driver.getCurrentUrl());
        System.out.println("PAGE SOURCE : " + driver.getPageSource());

        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("ultimateqa@yahoo.com");

        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("password");

        driver.close();

    }
}
