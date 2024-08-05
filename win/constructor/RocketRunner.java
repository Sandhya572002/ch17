class RocketRunner{
	public static void main(String[] args)
	{
		Rocket rocket=new Rocket(5.7);
		rocket.setRocket(15);
		rocket.fuelcapaity=5.6;
		rocket.display();
		System.out.println("-----------------");
		
		Rocket rocket1=new Rocket(6.7);
		rocket1.setRocket(17);
		rocket1.fuelcapaity=9.8;
		rocket1.display();
		System.out.println("-----------------");
		
		Rocket rocket2=new Rocket(9.7);
		rocket2.setRocket(16);
		rocket2.fuelcapaity=8.6;
		rocket2.display();
		System.out.println("-----------------");
	}
}