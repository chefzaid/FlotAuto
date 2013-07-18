package net.sas.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		
//		TestSuite suite = new TestSuite(EmployeTest.class,
//				VehiculeTest.class);
//		TestResult result = new TestResult();
//		suite.run(result);
		Result result = JUnitCore.runClasses(EmployeTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
