class BloodRunner{
	public static void main(String[] values)
	{
		
		System.out.println("running main in BloodRunner ");
		char group=Blood.group();
		System.out.println("blood group:"+group);
		
		String personName=Blood.personName();
		System.out.println("personName:"+personName);
		
		double cost=Blood.cost();
		System.out.println("cost:"+cost);
		
		boolean hospitalTested=Blood.hospitalTested();
		System.out.println("hospitalTested:"+hospitalTested);
		
		boolean sickness=Blood.sickness();
		System.out.println("sickness:"+sickness);
		
		boolean donate =Blood.donate();
		System.out.println("donate:"+donate);
		

		
		
	
	}	
}
