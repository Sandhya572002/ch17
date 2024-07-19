class Train{
	public static void book(String source,String destination)
	{
		System.out.println("------------------------------------------------");
		System.out.println("running model in Train with two parameters");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
	}
	public static void book(String source,String destination,int quantity)
	{
		System.out.println("------------------------------------------------");
		System.out.println("running model in Train with three parameters");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("quantity:"+quantity);
	}
	public static void book(String source,String destination,int quantity,int price)
	{
		System.out.println("------------------------------------------------");
		System.out.println("running model in Train with three parameters");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
	}
	public static void cancel(int ticketNo)
	{
		System.out.println("------------------------------------------------");
		System.out.println("running model in Train with one parameters");
		System.out.println("ticketNo:"+ticketNo);

	}
	public static void cancel(String source,String destination)
	{
		System.out.println("------------------------------------------------");
		System.out.println("running model in Train with two parameters");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
	}
}
