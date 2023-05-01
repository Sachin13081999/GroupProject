package Searching;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTesting {
    public static void main(String[] args) {
        // set the system property for the chromedriver executable file
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachi\\Desktop\\Testing\\Drivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();


        driver.get("https://www.amazon.com");


        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("selenium webdriver");


        searchBox.submit();


        WebElement resultsDiv = driver.findElement(By.id("resultsCol"));


        int numResults = resultsDiv.findElements(By.tagName("h2")).size();


        System.out.println("Number of search results: " + numResults);


        if (numResults > 0) {
            System.out.println("Test case passed.");
        } else {
            System.out.println("Test case failed.");
        }


        driver.quit();
    }
}
