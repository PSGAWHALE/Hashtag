package hashtag_FunctionalTestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase_JoinUsFormFunctionality {

	public static void main(String[] args) {

//Test case 1 : To enter a name 		
		
		// Set the path to the chromedriver.exe file
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar files1\\selnium-java\\chromedriver.exe");

				// Create a new instance of the ChromeDriver
				WebDriver driver = new ChromeDriver();

				// Maximize the browser window
				driver.manage().window().maximize();

				// Delete all cookies
				driver.manage().deleteAllCookies();

				// Navigate to the desired URL
				driver.navigate().to("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");

				// Wait for the textboxname element to be clickable
				WebDriverWait wait = new WebDriverWait(driver, 10);
				WebElement textboxname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contact-form\"]/div/div[2]/input")));

				// Scroll to the textboxname element using JavaScript
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", textboxname);

				// Move to the textboxname element
				  Actions actions = new Actions(driver);
				  actions.moveToElement(textboxname).perform();
				
				// Click on the textboxname element
				textboxname.click();

				// Enter the name "Ram Kumar" into the textboxname element
				textboxname.sendKeys("Jon Brate");
				
				
//Test case 2 : To enter a mail address				
				
				// Wait for the textboxmail element to be clickable
				   WebElement textboxmail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contact-form\"]/div/div[3]/input")));
						
				// Click on the textboxmail element
				   textboxmail.click();

				// Enter the email address "abc@gmail.com" into the textboxmail element
				   textboxmail.sendKeys("abc@gmail.com");
				   
//Test case 3 : To enter phone number				   
				   
				// Wait for the presence of the textboxphone element
					
					WebElement textboxphone = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contact-form\"]/div/div[4]/input")));
						
					
				// Enter the phone number "9132487945" into the textboxphone element
					textboxphone.sendKeys("9132487945");
					
//Test case 4 : To choose the resume file					
					
				// Locate the Choosefile element by xpath
					WebElement choosefile = driver.findElement(By.xpath("//*[@id=\"inputFile\"]"));
					
				// Perform the desired action on the Choosefile element
					choosefile.sendKeys("C:/HASHTAG TEST CASES/sample-the-seeker-resume.pdf");
					
//Test case 5 :	To enter a description about candidate				
					
				// Locate the Description element
					WebElement description = driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div/div[6]/textarea"));

				// Add your code to enter the description text in the Description element
					description.sendKeys("I am a person with a positive attitude, innovative, quick learner, and adaptive in nature.");
				   
//Test case 6 : To check apply now button is clickable or not   
					
					
					// Wait for the presence of the Button element
					
					WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contact-form\"]/div/div[7]/div/button[1]")));	
                   
					
					// Click on the Button element using JavaScript
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", button);

//Test case 7 : To check that childbutton is clickable or not
					
					// Wait for the presence of the Childbutton element
					
					WebElement childButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contact-form\"]/div/div[7]/div/button[2]/span/span")));
					
					// Click on the Childbutton element using JavaScript
					executor.executeScript("arguments[0].click();", childButton);

	}

}
