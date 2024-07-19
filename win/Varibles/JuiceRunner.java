class JuiceRunner{
	public static void main(String[] juice)
	{
		System.out.println("starts Juice in JuiceRunner");
		if(juice.length==5)
		{
		String names=juice[0];
		String brands= juice[1];
		String flavour= juice[2];
		String prices= juice[3];
		String quantitys= juice[4];
		float convertedprices=Float.parseFloat(prices);
		float convertedquantitys=Float.parseFloat(quantitys);
		Juice.juiceInformation(names,brands,flavour,convertedprices,convertedquantitys);
		}
		System.out.println("ends Juice in JuiceRunner");
		
	}
}
