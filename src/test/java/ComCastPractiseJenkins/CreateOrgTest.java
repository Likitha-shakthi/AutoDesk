package ComCastPractiseJenkins;

import org.testng.annotations.Test;

public class  CreateOrgTest {
	
	@Test
	public void createOrg()
	{
		System.out.println("This is the first create org");
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
	}
	
	@Test
	public void createOrg1()
	{
		System.out.println("This is the second create org");
	}
	

}
