package com.areyes1.jgc.test.suite.runner;


import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

import com.areyes1.jgc.test.suite.JUnitSuite1Test;

public class TestRunnerForTestSuite {

	public static void main(String[] args) {
		org.junit.runner.Result result = JUnitCore.runClasses(JUnitSuite1Test.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
