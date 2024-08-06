class CapitalCity{
	String name;
	double population;
	public CapitalCity(String name,double population)
	{
		System.out.println("created CapitalCity");
		this.name=name;
		this.population=population;
	}
	public void display()
	{
		System.out.println("created 1 String and 1 double const");
		System.out.println("Name: "+name);
		System.out.println("population: "+population);
	}
}