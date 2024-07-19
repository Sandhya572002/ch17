class ShopkeeperRunner{
	public static void main(String[] args)
	{
		Shopkeeper.product("apple");
		Shopkeeper.iteam("zara",5.6);
		int cost =Shopkeeper.cost();
		System.out.println("cost:"+cost);
		String name=Shopkeeper.name();
		System.out.println("name:"+name);
		
		
		
	}
}