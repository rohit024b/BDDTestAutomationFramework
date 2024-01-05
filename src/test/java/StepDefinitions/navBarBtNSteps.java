package StepDefinitions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class navBarBtNSteps {

	static WebDriver driver;
	String base_URLString = "https://leverageedu.com/course-finder/";
	@After
    public void tearDown() {
        // Quit the WebDriver after each test case (this will close the browser)
        if (driver != null) {
            driver.quit();
        }
	}
	@Given("verify the title as {string} is displayed")
	public void verify_the_title_as_is_displayed(String titleName)
	{
		driver = new ChromeDriver();
		driver.get(base_URLString);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Actions().sendKeys(Keys.ESCAPE).build().perform();
//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
//		_driver= new ChromeDriver();
//		_driver.navigate().to(base_URLString);
//		_navigationBarPages= new navigationBarPages(_driver);
//		_navigationBarPages.verifyTheTitle(navBarOption);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//		assertEquals(titleName, _driver.getTitle());
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, titleName);			
	}



//	private By _navBarbuttons= By.xpath("//a[text()='About Us']");
	private String navBarButtonString = "//a[text()='%s']";
//
//	private String parentWindowString = driver.getWindowHandle();
//	private String childWindowString = driver.getWindowHandles().iterator().next();

	@When("user clicks on navigation button {string}")
	public void user_clicks_on_navigation_button(String btnName) 
	{
//		_navigationBarPages.navBarButtons(string);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		//		_driver.findElement(By.xpath(String.format(navBarButtonString, btnName)));
		By clickNavButtonBy = By.xpath(String.format(navBarButtonString, btnName));
//		System.out.println(clickNavButtonBy);
		driver.findElement(clickNavButtonBy).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	


	@Then("verify the title as {string}")
	public void verify_the_title_as(String titleName) 
	{
//		String parentWindowString = driver.getWindowHandle();
//		String childWindowString = driver.getWindowHandles().iterator().next();
//		_navigationBarPages.switchWindowToLast();
//		_navigationBarPages.verifyTheTitle("title");
//		driver.switchTo().window(childWindowString);
		String mainWindowHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                // Switch to the new tab
                driver.switchTo().window(handle);
            }
            }
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		//		assertEquals(titleName, _driver.getTitle());
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, titleName);

	}

}


