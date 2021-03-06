import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest1_1 {
    @Test
    public void testMenuStartTitle() throws InterruptedException {


        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/dimkanevidimka/Desktop/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";

        String expectedResult = "Welcome to 99 Bottles of Beer";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement menuBrowseLanguages = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id ='navigation']/ul[@id='menu']/li/a[@href='/abc.html']")
        );

        menuBrowseLanguages.click();

        WebElement menuStart = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/']")
        );
        menuStart.click();



        WebElement h2 = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/h2"));
        String actualResult = h2.getText();

        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }


    @Test
    public void testTitleOfThePage(){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/dimkanevidimka/Desktop/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "99 Bottles of Beer";


        System.setProperty(chromeDriver,driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement titleOfThePage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='header']/h1")
        );
        String actualResult = titleOfThePage.getText();

        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();

    }


    @Test

    public void testMenuSubmitNewLanguage(){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/dimkanevidimka/Desktop/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit New Language";

        System.setProperty(chromeDriver,driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement menuSubmitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']" +
                        "/li/a[@href='/submitnewlanguage.html']")
        );
        String actualResult = menuSubmitNewLanguage.getText();

        Assert.assertEquals(actualResult, expectedResult.toUpperCase());
        driver.quit();
    }



    @Test
    public void testTitleOfSubmitNewLanguage(){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/dimkanevidimka/Desktop/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit New Language";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement titleSubmitNewlanguage1 = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']" +
                        "/ul[@id='menu']/li/a[@href='/submitnewlanguage.html']")
        );

        titleSubmitNewlanguage1.click();
        WebElement titleSubmitNewlanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']//div[@id='navigation']/ul[@id='submenu']" +
                        "/li/a")

        );


        String actualResult = titleSubmitNewlanguage.getText();
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();

    }


    @Test
    public void testABCPage(){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/dimkanevidimka/Desktop/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/abc.html";
        String expectedResult = "0-9";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement pageABC = driver.findElement(
                By.xpath("//body/div[@id='wrap']//div[@id='navigation']/ul[@id='submenu']/li/a")
        );
        String actualResult = pageABC.getText();
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }


    @Test
    public void testNames(){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/dimkanevidimka/Desktop/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult1 = "Oliver Schade";
        String expectedResult2 = "Gregor Scheithauer";
        String expectedResult3 = "Stefan Scheler";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement startMenuTeam = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/li/a")
        );
        startMenuTeam.click();

        WebElement oliverName = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3")
        );
        String actualResult1 = oliverName.getText();
        Assert.assertEquals(actualResult1, expectedResult1);

        WebElement gregorName = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[2]")
        );
        String actualResult2 = gregorName.getText();
        Assert.assertEquals(actualResult2, expectedResult2);

        WebElement stefanName = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[3]")
        );
        String actualResult3 = stefanName.getText();
        Assert.assertEquals(actualResult3, expectedResult3);

        driver.quit();

    }

    @Test
    public void testError(){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/dimkanevidimka/Desktop/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "Error: Precondition failed - Incomplete Input.";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement menuSubmit = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/form/p/input[@value='Submit Language']")
        );
        menuSubmit.click();

        WebElement error = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/p")
        );
        String actualResult = error.getText();
        Assert.assertEquals(actualResult,expectedResult);

        driver.quit();
    }
    @Test
    public void testTextImportant(){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/dimkanevidimka/Desktop/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "IMPORTANT: Take your time! The more carefully you fill out this form " +
                "(especially the language name and description), the easier it will be for us and the faster " +
                "your language will show up on this page. We don't have the time to mess around with fixing your " +
                "descriptions etc. Thanks for your understanding.";
        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement importantText = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li/span")
        );
        String actualResult = importantText.getText();
        driver.quit();


    }
}

