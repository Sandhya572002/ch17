class SoftwareEnginner{
	String name;
	int experince;
	String Designation;
	double salary;
	public SoftwareEnginner(String name,int experince,String Designation,double salary)
	{
		System.out.println("created SoftwareEnginner");
		this.name=name;
		this.experince=experince;
		this.Designation=Designation;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("created 2 String and 1 int and 1 double const");
		System.out.println("SoftwareEnginner Name: "+name);
		System.out.println("experince: "+experince);
		System.out.println("Designation: "+Designation);
		System.out.println("salary: "+salary);
	}
}