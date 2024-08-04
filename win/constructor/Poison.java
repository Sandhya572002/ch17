class Poison{
	int no;
	String name;
	double price;
	public Poison(int no,String name,double price)
	{
		//this:::is a keyword used to diffe the local variable n instance variable
		this.no=no;
		this.price=price;
		this.name=name;
		System.out.println("created int double String");
	}
}