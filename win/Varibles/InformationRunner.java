class InformationRunner{
	public static void main(String[] information)
	{
		System.out.println("starts information in InformationRunner");
		if(information.length==4)
		{
		String names=information[0];
		String manfactureDate= information[1];
		String prices= information[2];
		String quantitys= information[3];
		int convertedmanfactureDate=Integer.parseInt(manfactureDate);
		float convertedprices=Float.parseFloat(prices);
		float convertedquantitys=Float.parseFloat(quantitys);
		Information.medicineInformation(names,convertedmanfactureDate,convertedprices,convertedquantitys);
		}
		System.out.println("ends information in InformationRunner");
		
	}
}
