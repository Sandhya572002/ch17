class LipstickRunner{
	public static void brands(String[] brands)
	{
		System.out.println("start brands in LipstickRunner");

		for(int position=0;position<brands.length;position++)
		{
			//backward
			for(int brand=br ands.length-1; brand>=0;brand--)
			String ref=brands[position];
			System.out.println("brands:"+ref);
			//System.out.println("comapny:"+cement[bard]);

		}
		
		System.out.println("end brands in LipstickRunner");
	}
	public static void modelNo(int[] modelNo)
	{
		System.out.println("start modelNo in LipstickRunner");

		for(int no=0;no<modelNo.length;no++)
		{
			int ref1=modelNo[no];
			System.out.println("brands:"+ref1);
			//System.out.println("comapny:"+cement[bard]);

		}
		
		System.out.println("end modelNo in LipstickRunner");
	}
	
}