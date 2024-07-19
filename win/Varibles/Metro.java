class Metro{
	public static void seat()
	{
		System.out.println("------------------------------------------------");
		System.out.println("running seat in Metro without parameters");
		String name="vipul";
		System.out.println("name:"+name);
		
	}
	public static void  driver(String colour)
	{
		System.out.println("------------------------------------------------");
		System.out.println("running driver in Metro with one parameters");
		System.out.println("colour:"+colour);
		
	}
	public static void  main(double length,double width)
	{
		System.out.println("------------------------------------------------");
		System.out.println("running main in Metro with two parameters");
		System.out.println("length:"+length);
		System.out.println("width:"+width);
		
		
	}
	public static void  allow(String name,int people,boolean isgoing)
	{
		System.out.println("------------------------------------------------");
		System.out.println("running seat in Metro with three parameters");
		System.out.println("name:"+name);
		System.out.println("people:"+people);
		System.out.println("isgoing:"+isgoing);
		
		
	}
	public static void  people(float ticket)
	{
		System.out.println("------------------------------------------------");
		System.out.println("running people in Metro with one parameters");
		System.out.println("ticket:"+ticket);
		
	}
	
	
}