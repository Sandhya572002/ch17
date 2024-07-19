class Country{
	public static void states(String[] states)
	{
		System.out.println("======================================================");
		System.out.println("starts States in Country");
		for(int value=0;value<states.length;value++)
		{
			String ref=states[value];
			System.out.println("States:"+ref);
			 
		}
		System.out.println("======================================================");
		for(int values=states.length-1; values>=0;values--)
		{
			String refs=states[values];
			System.out.println("States:"+refs);
			
		}
		System.out.println("ends States in Country");
		
	}
	public static void pincode(int[] pincode)
	{
		System.out.println("======================================================");
		System.out.println("starts Pincode in Country");
		for(int pin=0;pin<pincode.length;pin++)
		{
			int allow=pincode[pin];
			System.out.println("Pincode:"+allow);
			
		}
		System.out.println("======================================================");
		for(int pni=pincode.length-1;pni>=0;pni--)
		{
			int allows=pincode[pni];
			System.out.println("Pincode:"+allows);
		}
		System.out.println("ends Pincode in Country");
		
	}
	public static void primeminister(String[] primeminister)
	{
		System.out.println("======================================================");
		System.out.println("starts primeminister in Country");
		for (int miniter=0;miniter<primeminister.length;miniter++)
		{
			String form=primeminister[miniter];
			System.out.println("prime Minister:"+form);
			
		}
		System.out.println("======================================================");
		for (int minister=primeminister.length-1;minister>=0;minister--)
		{
			String forms=primeminister[minister];
			System.out.println("prime Minister:"+forms);
		}
		System.out.println("ends Primeminister in Country");
		
	}
	public static void cabinetMinisters(String[] cabinetMinisters)
	{
		System.out.println("======================================================");
		System.out.println("starts CabinetMinisters in Country");
		for(int cabinet=0;cabinet<cabinetMinisters.length;cabinet++)
		{
			String cab=cabinetMinisters[cabinet];
			System.out.println("Cabinet Ministers:"+cab);
			
		}
		System.out.println("======================================================");
		for(int cabinets=cabinetMinisters.length-1;cabinets>=0;cabinets--)
		{
			String cabs=cabinetMinisters[cabinets];
			System.out.println("Cabinet Ministers:"+cabs);
		}
		System.out.println("starts CabinetMinisters in Country");
		
		
	}
	public static void politicalParties(String[] politicalParties)
	{
		System.out.println("======================================================");
		System.out.println("starts PoliticalParties in Country");
		for(int political=0;political<politicalParties.length;political++)
		{
			String pol=politicalParties[political];
			System.out.println("Political Parties:"+pol);
			
		}
		System.out.println("======================================================");
		for(int politicals=politicalParties.length-1;politicals>=0;politicals--)
		{
			String pols=politicalParties[politicals];
			System.out.println("Political Parties:"+pols);
			
		}
		System.out.println("starts PoliticalParties in Country");
		
		
	}
}
