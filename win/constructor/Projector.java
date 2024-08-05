class Projector{
	String company="epson";
	String type;
	String color;
	double weight;
	public void display()
	{
		System.out.println("created Projector");
		System.out.println("company:"+this.company);
		System.out.println("type:"+this.type);
		System.out.println("color:"+this.color);
		System.out.println("weight:"+this.weight);
	}
	public Projector(String type)
	{
		this.type=type;
	}
	public void setProjector(String color)
	{
		this.color=color;
	}
}