class Hotel{
	String name="A2B";
	Owner owner=new Owner("deepa",25,'F');
	public Hotel()
	{
		System.out.println("created with no arg");
	}
	public void show()
	{
		System.out.println("Hotel name: "+this.name);
		this.owner.show();
	}
}