class SimCard{
	String SimCardName;
	long no;
	int cost;
	public SimCard(String SimCardLocal,long noLocal,int costLocal)
	{
		System.out.println("created SimCard");
		SimCardName=SimCardLocal;
		no=noLocal;
		cost=costLocal;
		System.out.println("SimCardName:"+SimCardName);
		System.out.println("no:"+no);	
		System.out.println("cost:"+cost);
		
	}
}