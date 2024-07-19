class PersonRunner{
	public static void main(String[] person)
	{
		System.out.println("starts queens in QueenRunner");
		if(person.length==4)
		{
			String name=person[0];
			String email=person[1];
			String age=person[2];
			String password=person[3];
			System.out.println("Name:"+name);
			System.out.println("Email:"+email);
			System.out.println("Age:"+age);
			System.out.println("Password:"+password);
		}
		else{
			System.out.println("not enough ref");
		}
		System.out.println("ends queens in QueenRunner");
		
		
	}
}

//Write a class with main method and pass below info

//1. Main to take information of a person: name,email,age,password


