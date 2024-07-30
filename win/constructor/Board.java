class Board{
	int id;
	int cost;
	String color;
	public Board(int idLocal,int costLocal,String colorLocal)
	{
		System.out.println("created Board");
		id=idLocal;
		cost=costLocal;
		color=colorLocal;
		System.out.println("id:"+id);
		System.out.println("cost:"+cost);	
		System.out.println("color:"+color);
		
	}
}