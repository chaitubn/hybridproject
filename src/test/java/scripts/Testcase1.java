package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass{
	@Test
	public void tc1() {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		utilities.switchingtabs(driver);
		
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilities.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingtab();
		
		AddtoCartPage d=new AddtoCartPage(driver);
		utilities.doubleClick(driver, d.getAddbtn());
		d.carttocartbtn();
		utilities.alertPopup(driver);
	
	}

}
