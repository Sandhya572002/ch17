class Trimmer{

	Blade blade=new Blade("gilletee",90);
	String brand="philips";
	Trimmer(String brand)
	{
		this.brand=brand;
		System.out.println("created uuing string");
	}
	public void display()
	{
		blade.display();
		System.out.println("brand:"+brand);
	}

}