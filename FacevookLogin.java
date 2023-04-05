package day5AssignmentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacevookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver launch = new ChromeDriver();
		launch.manage().window().maximize();
		launch.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));
		launch.get("https://en-gb.facebook.com/");
		launch.findElement(By.xpath("//a[text()='Create new account']")).click();
		launch.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Venkatesh");
		launch.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pandian");
		launch.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8754956602");
		launch.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("26@2045");
		launch.findElement(By.xpath("(//select[@id='day'])")).sendKeys("26");
		launch.findElement(By.xpath("(//select[@id='month'])")).sendKeys("Nov");
		
		Select day = new Select(launch.findElement(By.id("day")));
		day.selectByValue("26");
		
		Select month = new Select(launch.findElement(By.id("month")));
		month.selectByIndex(10);
		
		Select year = new Select(launch.findElement(By.id("year")));
		year.selectByValue("1995");
		
		launch.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		Thread.sleep(5000);
		
	

	}


	}


