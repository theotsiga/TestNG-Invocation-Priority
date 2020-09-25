package multipletestmethods;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount=7)
	public void kirani() 
	{
	System.out.println("kirani");	
	}

	@Test (invocationCount=3)
	public void dad() 
	{
	System.out.println("dad");
	}

	@Test(invocationCount=6)
	public void mom() 
	{
	System.out.println("mom");	
	}
	
	@Test(invocationCount=1)
	public void gaby() 
	{
	System.out.println("gaby");	
	}
	
	@Test(invocationCount=5)
	public void micah() 
	{
	System.out.println("micah");
	}
	
}
