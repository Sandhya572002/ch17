class Country{
	String name;
	String contient;
	State state=new State("karnataka","kannada");
	public Country(String name,String contient)
	{
		System.out.println("created Country");
		this.name=name;
		this.contient=contient;
	}
	public void display()
	{
		System.out.println("created 2 String const");
		System.out.println("Name: "+name);
		System.out.println("contient: "+contient);
		this.state.display();
	}
}