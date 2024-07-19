class Room{
	public static double hater(String medicineName)
	{
		System.out.println("running hater in Room");
		if(medicineName=="dolo")
		{
			return 56;
		}
		if(medicineName=="diclofenac")
		{
			return 76;
		}
		if(medicineName=="paracetamol")
		{
			return 66;
		}
		return 0;
		
	}
	public static String cases(String symptom )
	{
		System.out.println("running cases in Room");
		if(symptom=="cold")
		{
			return "paracetamol";
		}
		if(symptom=="fever")
		{
			return "diclofenac";
		}
		if(symptom=="headcahe")
		{
			return "dolo";
		}
		return "not found";
	}
		public static boolean lower(String doctorName )
	{
		System.out.println("running cases in Room");
		if(doctorName=="sindhu")
		{
			return true;
		}
		if(doctorName=="jack")
		{
			return true;
		}
		if(doctorName=="virat")
		{
			return true;
		}
		return false;
	}
}

//B. Write a class with below methods
//1.Method to take medicineName and return price : 3 condition
//2.Method to take symptom and return medicineName: 3 condition
//3.Method to take doctor name and return availability:3 condition