class Soil{
	public static String hello(int cost){
	
	
	System.out.println("running hello in Soil");
	if(cost>0)
	{
		return "soil is good";
	}
	else if(cost<0)
	{
		return"soil is bad";
	}
	else
	{
		return "soil is waste";
	}
	
	}
	public static boolean water(int price)
	{
		System.out.println("------------------");
	System.out.println("running hello in Soil");
	if(price>0)
	{
		return true;
	}
	else if(price==0)
	{
		return true;
		
	}
	return false;
	}
	public static void bottle(String name)
	{
	System.out.println("------------------");
	System.out.println("running bottle in Soil");
	if(name=="kajal")
	{
		System.out.println("no return type");
	}
	else
	{
	    System.out.println(" not return type");
	}
	    
	}
	
}















