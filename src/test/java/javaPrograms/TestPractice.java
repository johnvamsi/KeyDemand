package javaPrograms;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

interface Parent1
{
	    int a=10;
	    void displayA();
	   
	    
}
interface Parent2
{
	    int b=20;
	    void displayB();
	    
}
public class TestPractice implements Parent1,Parent2 {

	
public static void main(String[] args) throws Exception {
	
	 WebDriverManager.chromedriver().setup();
	
	
	
	
	
	
	
	
	
			
         }

@Override
public void displayB() {
	System.out.println("The value of B is    "+b);
	
}

@Override
public void displayA() {
	System.out.println("The value of A is    "+a);
	
}
}