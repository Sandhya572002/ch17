class FoodItem{
	public static double getPrice(String iteam){
		System.out.println("starting getPrice");
		System.out.println("iteam arg"+iteam);
		
		if(iteam=="paneer"){
			System.out.println("iteam is panner");
			return 10;
		}
		if(iteam=="biriyani")
		{
			System.out.println("iteam is biriyani");
			return 140;
		}
		if(iteam=="kebab"){
			System.out.println("iteam is kebab");
			return 70;
		}
		
		System.out.println("no iteam");
		return 0;
		
	}
}
