class KnifeRunner{
	public static void main(String[] values)
	{
		
		System.out.println("running ");
		Knife.cut();//invoking the method cut
		int value=Knife.cut();//
		System.out.println("cut return type: "+value);
		boolean ref=Knife.sharp();//
		System.out.println("sharp return type: "+ref);
		
		
	
	}		
}                                                                                                                                                                                       