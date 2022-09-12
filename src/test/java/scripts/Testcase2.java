package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{
	
	@Test
	public void tc2() throws IOException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilities.switchingtabs(driver);
		utilities.dropdown(sd.getCoursedd(),pdata.getPropertydata("coursedd"));
		
		TestingPage tp = new TestingPage(driver);
		utilities.dragdrop(driver,tp.getSeleniumtraining(),tp.getCarttab());
		Point loc = tp.getFacebook().getLocation();
		int x = loc.getX();
		int y= loc.getY();
				utilities.scrollBar(driver, x, y);
				tp.facebookicon();
	}

	
}
