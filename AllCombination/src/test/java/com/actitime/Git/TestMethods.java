package com.actitime.Git;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethods extends TestAnnotation{
@Test
public void create()
{
	Reporter.log("Create ",true);
	extent.createTest("This is create actitime")
	.assignAuthor("Ricku")
	.assignCategory("SmokeTest")
	.assignDevice("Window 11");
	
}
}
