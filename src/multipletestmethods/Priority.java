package multipletestmethods;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=1)
	public void kirani() 
	{
	System.out.println("kirani");	
	}

	@Test(priority=4)
	public void dad() 
	{
	System.out.println("dad");
	}

	@Test(priority=2)
	public void mom() 
	{
	System.out.println("mom");	
	}
	
	@Test(priority=5)
	public void gaby() 
	{
	System.out.println("gaby");	
	}
	
	@Test(priority=3)
	public void micah() 
	{
	System.out.println("micah");
	}
}
