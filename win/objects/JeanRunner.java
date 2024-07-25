class JeanRunner{
	public static void main(String arg[]){
		Jean jean=new Jean();
		String color=jean.color;
		String brand=jean.brand;
		double cost=jean.cost;
		System.out.println("Color:"+color);
		System.out.println("brand:"+brand);
		System.out.println("cost:"+cost);
		jean.color="red";
		jean.cost=90;
		System.out.println("Color:"+jean.color);
		System.out.println("cost:"+jean.cost);
		jean.brand="max";
		System.out.println("brand:"+jean.brand);

		
		
		
		Jean jean1=new Jean();
		jean1.brand="qax";
		System.out.println("brand:"+jean1.brand);
		jean1.cost=60;
		System.out.println("cost:"+jean1.cost);
		System.out.println("cost:"+jean1.color);
		jean1.color="blue";
		System.out.println("color:"+jean1.color);		
		System.out.println("brand:"+jean.brand);
		
		
		
		
	}
}