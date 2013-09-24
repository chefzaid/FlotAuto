package net.sas.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {

		// TestSuite suite = new TestSuite(EmployeeTest.class,
		// VehicleTest.class);
		// TestResult result = new TestResult();
		// suite.run(result);
		Result result = JUnitCore.runClasses(EmployeeTest.class,
				VehicleTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
