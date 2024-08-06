class Company{
	int id;
	String name;
	String location;
	SoftwareEnginner softwareEnginner=new SoftwareEnginner("sandhya",3,"aiml",3500);
	public Company(int id,String name,String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;
	}
	public void display()
	{
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Location: "+this.location);
		this.softwareEnginner.display();
	}
}