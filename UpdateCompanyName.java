package week2.day2Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UpdateCompanyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver ed = new EdgeDriver();
		ed.manage().window().maximize();
		ed.get("http://leaftaps.com/opentaps/control/login");
		ed.findElement(By.id("username")).sendKeys("DemoCsr");
		ed.findElement(By.id("password")).sendKeys("crmsfa");
		ed.findElement(By.className("decorativeSubmit")).click();
		ed.findElement(By.linkText("CRM/SFA")).click();
		ed.findElement(By.linkText("Leads")).click();
		ed.findElement(By.linkText("Create Lead")).click();
		ed.findElement(By.id("createLeadForm_companyName")).sendKeys("Cts");
		ed.findElement(By.id("createLeadForm_firstName")).sendKeys("Venkatesh");
		ed.findElement(By.id("createLeadForm_lastName")).sendKeys("Pandian");
		ed.findElement(By.name("submitButton")).click();
		ed.findElement(By.linkText("Edit")).click();
		WebElement Update = ed.findElement(By.id("updateLeadForm_companyName"));
			Update.clear();				
			Update.sendKeys("Cognizant");
		//ed.findElement(By.id("updateLeadForm_companyName")).sendKeys("Cognizant");
		ed.findElement(By.name("submitButton")).click();
	}

}
