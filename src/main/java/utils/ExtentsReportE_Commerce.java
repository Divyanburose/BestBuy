package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentsReportE_Commerce {

	public static ExtentReports getReport() {
		String path = "C:\\Users\\Anbu Rose\\eclipse-workspace\\capstoneE_commerce\\reports\\E_CommerceReport.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(path);
		reporter.config().setReportName("SpiceJet Report");
		
		//Add automation data to physical report
		ExtentReports extent = new ExtentReports();
	    extent.attachReporter(reporter);
	    return extent;
		}
	
	}

