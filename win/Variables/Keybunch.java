class Keybunch{
	String material;
	Key key;
	public Keybunch(String material,Key key)
	{
		this.material=material;
		this.key=key;
		System.out.println("created ");
	}
	public void details()
	{
		System.out.println("Material:"+material);
		key.details();
	}
	
}