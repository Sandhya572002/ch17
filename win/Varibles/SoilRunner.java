class SoilRunner{
	public static void main(String[] args){
		System.out.println("running main in SoilRunner");
		String cost=Soil.hello(50);
		System.out.println("SoilType:"+cost);
		cost=Soil.hello(-11);
		System.out.println("SoilType:"+cost);
		cost=Soil.hello(0);
		System.out.println("SoilType:"+cost);
		boolean price=Soil.water(-88);
		System.out.println("Price:"+price);
		Soil.bottle("sandhya");
	}

}