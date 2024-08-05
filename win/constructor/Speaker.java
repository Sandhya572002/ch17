class Speaker{
	String brand;
	char size='M';//lit
	double cost;
	boolean output;
	public void display()
	{
		System.out.println("brand:"+this.brand);
		System.out.println("size:"+this.size);
		System.out.println("cost:"+this.cost);
		System.out.println("output:"+this.output);
	}
	public Speaker(String brand)
	{
		this.brand=brand;
	}
	public void setCost(double cost)
	{
		this.cost=cost;
	}
}