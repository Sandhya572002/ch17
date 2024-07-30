class Lamp{
	String lampColor;
	double cost;
	public Lamp(String lampColorLocal,double costLocal)
	{
		System.out.println("created Lamp");
		lampColor=lampColorLocal;
		cost=costLocal;
		System.out.println("lampColor:"+lampColor);
		System.out.println("cost:"+cost);
	}
}