class WashingMachine{
	
	public static void rinse()
	{
		System.out.println("running rinse in WashingMachine ");
		
		
	
	}
	public static void makeNoise()
	{
		System.out.println("running makeNoise in WashingMachine ");
		shake();
	
	}
	public static void shake()
	{
		System.out.println("running shake in WashingMachine ");
		makeNoise();
	
	}
}
