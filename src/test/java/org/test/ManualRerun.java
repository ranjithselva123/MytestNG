package org.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ManualRerun implements IRetryAnalyzer {

	int minCount = 0;
	int maxCount = 5;

	public boolean retry(ITestResult arg0) {
		if(minCount<maxCount) {
			minCount++;
			return true;
		}
		return false;
	}

}
