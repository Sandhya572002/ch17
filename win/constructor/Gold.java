class Gold{
	int carat;
	double cost;
	public Gold(int caratLocal,double costLocal)
	{
		System.out.println("creating Gold");
		System.out.println("Carat:"+caratLocal);
		System.out.println("Carat:"+carat);
		System.out.println("cost:"+costLocal);
		System.out.println("cost:"+cost);
		carat=caratLocal;
		cost=costLocal;
		System.out.println("Carat updated :"+carat);
		System.out.println("cost updated:"+cost);
	}
}