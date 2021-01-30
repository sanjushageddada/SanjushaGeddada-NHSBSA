package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Page {
    private final WebDriver driver = Driver.getDriver();

    public void getUrl(final String url) {
        driver.get(url);
    }

    public void gettitle() {
        String actualtitle = driver.getTitle();
        System.out.println(actualtitle);
        String expectedtitle = "You get help with health costs";
        if (actualtitle.equals(expectedtitle)) {
            System.out.println("In right Page");

        } else {
            System.out.println("Not in right page");
        }
    }

    private final By startButton = By.id("next-button");

    public void setStartButton() {
        driver.findElement(startButton).click();

    }

    //   private static By CountryButton = By.xpath("//*[@id=\"radio-wales\"]");

    public void setCountryButton() {
        WebElement radio1 = driver.findElement(By.id("label-wales"));
        radio1.click();
        driver.findElement(By.id("next-button")).click();

    }

    public void getDateofBirth(String arg0, String arg1, String arg2)
    {
        WebElement dob_day = driver.findElement(By.id("dob-day"));
        WebElement dob_month = driver.findElement(By.id("dob-month"));
        WebElement dob_year = driver.findElement(By.id("dob-year"));
        dob_day.sendKeys(arg0);
        dob_month.sendKeys(arg1);
        dob_year.sendKeys(arg2);
        driver.findElement(By.id("next-button")).click();
    }
    public void getPartnerOption() {
        WebElement radio1 = driver.findElement(By.id("label-yes"));
        radio1.click();
        driver.findElement(By.id("next-button")).click();

    }
    public void getPartnerClaimOption() {
        WebElement radio1 = driver.findElement(By.id("label-no"));
        radio1.click();
        driver.findElement(By.id("next-button")).click();

    }
    public void getPragnencyOption() {
        WebElement radio1 = driver.findElement(By.id("label-no"));
        radio1.click();
        driver.findElement(By.id("next-button")).click();

    }
    public void getIllnessOption() {
        WebElement radio1 = driver.findElement(By.id("label-no"));
        radio1.click();
        driver.findElement(By.id("next-button")).click();

    }

    public void getDaiabetesOption() {
        WebElement radio1 = driver.findElement(By.id("label-no"));
        radio1.click();
        driver.findElement(By.id("next-button")).click();

    }
    public void getGlaucomaOption() {
        WebElement radio1 = driver.findElement(By.id("label-no"));
        radio1.click();
        driver.findElement(By.id("next-button")).click();

    }
    public void getCareHomeOption() {
        WebElement radio1 = driver.findElement(By.id("label-no"));
        radio1.click();
        driver.findElement(By.id("next-button")).click();

    }
    public void getSavingsOption() {
        WebElement radio1 = driver.findElement(By.id("label-no"));
        radio1.click();
        driver.findElement(By.id("next-button")).click();

    }

}
