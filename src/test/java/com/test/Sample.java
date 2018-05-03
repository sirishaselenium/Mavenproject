package com.test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public static void testing() {
		
		FirefoxDriver Driver=new FirefoxDriver();
		     Driver.get("https://www.google.com/?gws_rd=ssl");
		     
		
	
}

}
