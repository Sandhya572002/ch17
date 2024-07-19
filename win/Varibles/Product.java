class Product{
	public static void allow(String name,int quality)
	{
		System.out.println("running allow in Rabbit with two parameters");
		System.out.println("name:"+name);
		System.out.println("quality:"+quality);
		if(quality>0 && quality<50)
		{
			System.out.println("valid");
		}
		else{
			System.out.println("in -valid");
			
		}
		
		
	}
}