package Tests;

import org.testng.annotations.Test;

import Pages.Print_All_Windows_Titles;

public class Print_All_Titles_TC extends TestBase{

	Print_All_Windows_Titles  TP;

	@Test
	public void Print_all_Titles() throws InterruptedException  {



		TP = new Print_All_Windows_Titles(driver);
		TP.Print_All_Titles(driver);




	}

}
