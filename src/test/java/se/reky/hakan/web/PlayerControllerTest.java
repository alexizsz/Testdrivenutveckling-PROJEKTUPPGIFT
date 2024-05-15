package se.reky.hakan.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

@Disabled
public class PlayerControllerTest {

    FirefoxDriver driver;


    @BeforeAll
    public static void BeforeAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/players");
    }

    @Test
    @DisplayName("List size should match played games")
    public void verifyNumberOfPlayers(){
        List<WebElement> playerList = driver.findElements(By.tagName("li"));
        Assertions.assertEquals(playerList.size(),2);
    }

    @Test
    @DisplayName("First element in list should be shown")
    public void verifyFirstNameOfPlayers(){
        List<WebElement> playerList = driver.findElements(By.tagName("li"));
        WebElement firstName = playerList.get(0).findElement(By.className("player-name"));
        Assertions.assertTrue(firstName.isDisplayed(),"First name should be displayed");
    }

    @Test
    @DisplayName("Title should match")
    public void verifyTitle(){
        Assertions.assertEquals("Players List",driver.getTitle());
    }

    @Test
    @DisplayName("Buttontext should be - Logga in")
    public void verifyButtonText(){
        WebElement button = driver.findElement(By.tagName("button"));
        Assertions.assertEquals(button.getText(),"Logga in");
    }

    public void afterAll() {
        if (driver != null) {
            driver.quit();
        }
    }

}
