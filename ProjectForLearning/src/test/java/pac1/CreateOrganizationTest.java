package pac1;

import org.testng.annotations.Test;

public class CreateOrganizationTest {
@Test
public void createOrgTest() {
	
	String BROWSER=System.getProperty("browser");
	String URL=System.getProperty("url");
	String  USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	System.out.println(" enter the url");
	System.out.println(" enter the user name");
	System.out.println(" enter the password");
	System.out.println("  click on login button");
	System.out.println(" click on org link");
	System.out.println(" create organization");
	System.out.println(BROWSER);
	System.out.println(URL);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	
	
	
}
@Test
public void modifyOrgTest() {
	System.out.println(" enter the url");
	System.out.println(" enter the user name");
	System.out.println(" enter the password");
	System.out.println("  click on login button");
	System.out.println(" click on org link");
	System.out.println(" enter the industry name");
	System.out.println(" create organization");
	
}
}
