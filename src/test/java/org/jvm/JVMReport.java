package org.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateReport(String jsonfile) {
		File file = new File("C:\\Users\\Rajkumar\\eclipse-workspace\\CucumberDay7\\src\\test\\resources\\Report");
		Configuration configuration = new Configuration(file, "Automation");

		configuration.addClassifications("Browser", "chrome");
		configuration.addClassifications("Browser version", "88");
		configuration.addClassifications("Sprint", "35");
		configuration.addClassifications("OS", "windows");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonfile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}

}
