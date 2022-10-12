package bestbuy.extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTestng {
	public static ExtentSparkReporter report;
	static ExtentReports ext;
	public static ExtentReports getReportObject() {
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\Report\\Report.html";
		
		 report= new ExtentSparkReporter(path);
		report.config().setReportName("Web Automation Report");
		report.config().setDocumentTitle("Test Result");
		ext=new ExtentReports();
		ext.attachReporter(report);
		ext.setSystemInfo("Tester", "Sangeetha");
		return ext;
	}
	

}
