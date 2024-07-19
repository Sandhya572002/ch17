class ChainRunner{
		public static void main(String[] values)
	{
		
		System.out.println("running main in ChainRunner ");
		int carat=Chain.carat();
		System.out.println("Carat:"+carat);
		
		int costPerGram=Chain.costPerGram();
		System.out.println("CostPerGram:"+costPerGram);
		
        String type=Chain.type();
		System.out.println("Type:"+type);
		
		String quality=Chain.quality();
		System.out.println("Quality:"+quality);
		
		int quantity=Chain.quantity();
		System.out.println("Quantity:"+quantity);
		
		int wastage=Chain.wastage();
		System.out.println("Wastage:"+wastage);
		
		int serviceCharge=Chain.serviceCharge();
		System.out.println("ServiceCharge:"+serviceCharge);
		
		int gst=Chain.gst();
		System.out.println("GST:"+gst);
		
		

		
		
	
	}
}