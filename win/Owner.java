class Owner{
	String name;
	int age;
	char gender;
	public Owner()
	{
		System.out.println("created Owner");
	}
	public Owner(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;	
	}
	public void show()
	{
		System.out.println("Owner Name"+name);
		System.out.println("Owner age"+age);
		System.out.println("Owner gender"+gender);
	}
}