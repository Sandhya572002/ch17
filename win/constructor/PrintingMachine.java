class PrintingMachine{
	String name;
	String location;
	public PrintingMachine(String nameLocal,String locationLocal)
	{
		System.out.println("created PrintingMachine");
		name=nameLocal;
		location=locationLocal;
		System.out.println("Name:"+name);
		System.out.println("location:"+location);	
	}
}