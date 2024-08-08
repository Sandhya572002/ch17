class Key{
	double weight;
	String brand;
	public Key(double weight,String brand)
	{
		this.weight=weight;
		this.brand=brand;
	}
	public void details()
	{
		System.out.println("weight:"+weight);
		System.out.println("brand:"+brand);
	}
}