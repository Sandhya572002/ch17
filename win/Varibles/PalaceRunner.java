class PalaceRunner{
	public static void main(String[] palace)
	{
		System.out.println("starts PalaceRunner in PalaceRunner");
		if(palace.length==5)
		{
			String name= palace[0];
			String location= palace[1];
			String builtBy= palace[2];
			String buildYear= palace[3];
			

			System.out.println("Name:"+name);
			System.out.println("Location:"+location);
			System.out.println("BuiltBy:"+builtBy);
			System.out.println("BuildYear:"+buildYear);
			
		}
		else{
			System.out.println("not enough ref");
		}
		System.out.println("ends palace in PalaceRunner");
	}
}


//3. Main to take information of a palace: name,location,builtBy,buildYea