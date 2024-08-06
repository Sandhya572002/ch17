class State{
	String name;
	String language;
	CapitalCity capitalCity= new CapitalCity("banglore",456789);
	public State(String name,String language)
	{
		System.out.println("created State");
		this.name=name;
		this.language=language;
	}
	public void display()
	{
		System.out.println("created 2 String const");
		System.out.println("Name: "+name);
		System.out.println("language: "+language);
		this.capitalCity.display();
	}
	
}