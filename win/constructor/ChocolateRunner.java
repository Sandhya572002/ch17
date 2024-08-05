class ChocolateRunner{
	public static void main(String[] args)
	{
		Chocolate chocolate=new Chocolate(60);
		chocolate.size='m';
		chocolate.setChocolate("starberry");
		chocolate.display();
		System.out.println("-----------------");
		
		
		Chocolate chocolate1=new Chocolate(100);
		chocolate1.size='s';
		chocolate1.setChocolate("chocolate");
		chocolate1.display();
		System.out.println("-----------------");
		
		Chocolate chocolate2=new Chocolate(170);
		chocolate2.size='m';
		chocolate2.setChocolate("vennali");
		chocolate2.display();
		System.out.println("-----------------");
	}
}