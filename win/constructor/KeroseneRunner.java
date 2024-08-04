class KeroseneRunner{
	public static void main(String[] args)
	{
		Kerosene kerosene=new Kerosene();
		Kerosene kerosene1=new Kerosene(20.8,30,true);
		System.out.println("Price:"+kerosene1.price);
		System.out.println("quantity:"+kerosene1.quantity);
		System.out.println("quality:"+kerosene1.quality);
		Kerosene kerosene2=new Kerosene(false);
		System.out.println("quality:"+kerosene2.quality);
		Kerosene kerosene3=new Kerosene(20.8);
		System.out.println("Price:"+kerosene3.price);
		
		
	}

}