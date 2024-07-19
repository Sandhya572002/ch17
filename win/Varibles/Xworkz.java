class Xworkz{
	public static String allow(int code)
	{
	
		System.out.println("running allow in Xworkz");

		if(code==93)
		{
			return "afghanistan";
			
		}
		if(code==355)
		{
			return "algeria";
		}
		if(code==91)
		{
			return "india";
		}
		if(code==354)
		{
			return "iceland";
		}
		if(code==86)
		{
			return "china";
		}
		
        System.out.println("not found");
		return "not found";
		
	}
	public static double better(String iteam){
		System.out.println("running better in Xworkz");

		if(iteam=="paneer"){
			System.out.println("iteam is panner");
			return 1.1;
		}
		if(iteam=="biriyani")
		{
			System.out.println("iteam is biriyani");
			return 12.2;
		}
		if(iteam=="kebab")
		{
			System.out.println("iteam is kebab");
			return 2.2;
		}
		if(iteam=="rice")
		{
			System.out.println("iteam is rice");
			return 12;
		}
		if(iteam=="dosa")
		{
			System.out.println("iteam is dosa");
			return 22;
		}

		return 0;

		
		
		
	}
	public static String good(String movieName)
	{
		
		System.out.println("running good in Xworkz");
	
		if(movieName=="hello")
		{
			return "ram";
			
		}
		if(movieName=="utra")
		{
			return "shiva";
			
		}
		if(movieName=="power")
		{
			return "sitta";
			
		}
		if(movieName=="wonder")
		{
			return "allu";
			
		}
		if(movieName=="liger")
		{
			return "bunny";	
		}
		System.out.println("Not");
		return "not";
	
		
	}
	
}
