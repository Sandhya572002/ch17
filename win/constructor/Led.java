class Led{
	String ledName;
	int cost;
	String color;
	public Led(String ledNameLocal,int costdLocal,String colorLocal)
	{
		System.out.println("created Led");
		ledName=ledNameLocal;
		cost=costdLocal;
		color=colorLocal;
		System.out.println("ledName:"+ledName);
		System.out.println("cost:"+cost);	
		System.out.println("color:"+color);
		
	}
}