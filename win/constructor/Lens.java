class Lens{
	String shape;
	double cost;
	public Lens(String shapeLocal,double costLocal)
	{
		System.out.println("created Lens");
		shape=shapeLocal;
		cost=costLocal;
		System.out.println("shape:"+shape);
		System.out.println("cost:"+cost);	
	}
}