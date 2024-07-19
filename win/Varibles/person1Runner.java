class Person1Runner{
	public static void main(String[] args)
	{
		System.out.println("starts PalaceRunner in person1Runner");
		if(args.length==3)
		{
			String name= args[0];
			String mobile= args[1];
			String age= args[2];
			
			long convertwdmobile=Long.parseLong(mobile);
			int convertwdage=Integer.parseInt(age);
		

			Person1.print(name,convertwdmobile,convertwdage);
		}
		
		System.out.println("ends palace in person1Runner");
	}
}
