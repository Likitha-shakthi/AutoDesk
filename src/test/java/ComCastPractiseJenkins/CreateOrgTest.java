package ComCastPractiseJenkins;

import org.testng.annotations.Test;

public class  CreateOrgTest {
	
	@Test
	public void createOrg()
	{
		System.out.println("This is the first create org");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		
		
		
	}
	
	@Test
	public void createOrg1()
	{
		System.out.println("This is the second create org");
	}
	

}
