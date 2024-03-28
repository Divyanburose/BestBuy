package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility {
	public static WebDriver driver;	
	public String excelFile;
	
		public void browserLaunch() throws IOException {
			//to read the prop file
			FileReader reader = new FileReader("C:\\Users\\Anbu Rose\\eclipse-workspace\\capstoneE_commerce\\src\\main\\resources\\TestData.properties");
			//read the properties
			Properties prop = new Properties();
			prop.load(reader);
//Cross Browser test			
			if(prop.getProperty("browser").equals("Chrome")) {
				 driver = new ChromeDriver();
			}else if(prop.getProperty("browser").equals("Edge")) {
				driver = new EdgeDriver();
			}else if (prop.getProperty("browser").equals("Firefox")) {
				driver = new FirefoxDriver();
			}
           
		    driver.get(prop.getProperty("url"));
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
	}
		
	public void nation() {
		 driver.findElement(By.xpath("//img[@alt=\"United States\"][1]")).click();	
	}
	 // SCREENSHOT
public String takeScreenshot(String screenshotName) throws IOException {
		
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String screenshotTitle = time.toString().replace(":", "").replace(" ","");
		
		String path ="C:\\Users\\Anbu Rose\\eclipse-workspace\\capstoneE_commerce\\screenshot\\"+screenshotTitle+".png";
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(source, dest);
		return path;
	
	}
		
	public void close() {
		//driver.close();
	}
	public String[][] readExcel(String excelFile) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\Anbu Rose\\eclipse-workspace\\capstoneE_commerce\\data\\"+excelFile+".xlsx");
		XSSFSheet sheet1 = book.getSheetAt(0);
		
		
		int rowCount = sheet1.getLastRowNum();
		int columnCount = sheet1.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][columnCount] ;
		
		//Get into row
		for(int i =1;i<=rowCount;i++) {
			XSSFRow row = sheet1.getRow(i);
		
		//Get into column
		for(int j =0;j<columnCount;j++) {
			XSSFCell cell = row.getCell(j);
		
		//read the data from excel
			data[i-1][j] = cell.getStringCellValue();
		
		}
		}
		book.close();
		return data;		
}
}
