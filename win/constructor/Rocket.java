class Rocket{
	String country="India";
	double speed;
	double fuelcapaity;
	int noofthrusters;
	public void display()
	{
		System.out.println("country:"+this.country);
		System.out.println("speed:"+this.speed);
		System.out.println("fuelcapaity:"+this.fuelcapaity);
		System.out.println("noofthrusters:"+this.noofthrusters);
	}
	public Rocket(double speed)
	{
		this.speed=speed;
	}
	public void setRocket(int noofthrusters)
	{
		this.noofthrusters=noofthrusters;
	}
	
}