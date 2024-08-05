class Paper{
	double thickness=10.0;
	String size;
	String quality;
	String color;
	public void display()
	{
		System.out.println("created Paper");
		System.out.println("thickness:"+this.thickness);
		System.out.println("size:"+this.size);
		System.out.println("quality:"+this.quality);
		System.out.println("color:"+this.color);
	}
	public Paper(String size)
	{
		this.size=size;
	}
	public void setPaper(String quality)
	{
		this.quality=quality;
	}
}