class Blade{
	String brand;
	double cost;
	public Blade(String brand,double cost)
	{
		this.brand=brand;
		this.cost=cost;
	}
	public void display()
	{
		System.out.println("Brand:"+this.brand);
		System.out.println("Cost:"+this.cost);
	}
}