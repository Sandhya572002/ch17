class Shopkeeper{
	public static void product(String name)
	{
		System.out.println("running product in Shopkeeper");
		System.out.println("Name:"+name);
	}
	public static void iteam(String brand,double price)
	{
		System.out.println("running iteam in Shopkeeper");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
	}
	public static int cost()
	{
		System.out.println("running cost in Shopkeeper");
		int cost=90;
		return cost;
		
	}
	public static String name()
	{
		System.out.println("running allow in Shopkeeper");
		String name="abcd";
		return name;//return "abcd";
		//System.out.println("running allow in Shopkeeper");
		//return "abcd";
		
	}
	
}