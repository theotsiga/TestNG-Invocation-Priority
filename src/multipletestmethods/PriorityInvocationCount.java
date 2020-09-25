package multipletestmethods;

import org.testng.annotations.Test;

public class PriorityInvocationCount {

	@Test(invocationCount=3,priority=1)
	public void kirani() 
	{
	System.out.println("kirani");	
	}

	@Test (invocationCount=2,priority=2)
	public void dad() 
	{
	System.out.println("dad");
	}

	@Test(invocationCount=1,priority=5)
	public void mom() 
	{
	System.out.println("mom");	
	}
	
	@Test(invocationCount=4,priority=3)
	public void gaby() 
	{
	System.out.println("gaby");	
	}
	
	@Test(invocationCount=5,priority=2)
	public void micah() 
	{
	System.out.println("micah");
}
}