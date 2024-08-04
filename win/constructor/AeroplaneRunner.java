class AeroplaneRunner{
	public static void main(String[] values)
	{
		Aeroplane aeroplane=new Aeroplane();
		Aeroplane aeroplane1=new Aeroplane("dhee",30,45.5,"tc palya","banglore");
		System.out.println("Company:"+aeroplane1.company);
		System.out.println("noOfSeats:"+aeroplane1.noOfSeats);
		System.out.println("TicketPrice:"+aeroplane1.ticketPrice);
		System.out.println("Source:"+aeroplane1.source);
		System.out.println("Destination:"+aeroplane1.destination);
		
		Aeroplane aeroplane2=new Aeroplane("hee","majestic","usa");
		System.out.println("Company:"+aeroplane2.company);
		System.out.println("Source:"+aeroplane2.source);
		System.out.println("Destination:"+aeroplane2.destination);
		
		
		Aeroplane aeroplane3=new Aeroplane("naudty",55.5,"rajajinagar","canada");
		System.out.println("Company:"+aeroplane3.company);
		System.out.println("TicketPrice:"+aeroplane3.ticketPrice);
		System.out.println("Source:"+aeroplane3.source);
		System.out.println("Destination:"+aeroplane3.destination);
		
		
		
		
		
	}
}