class RunRunner{
	char gender='M';
	gender='?';
	{
		
	}
System.out.println(email);//with in scope
}
System.out.println(email);without scope
class AppleRunner{
	public static void main(String[] args)
	{
		String fruit="Mango";
		fruit="Apple";
		String allow=fruit+"is good for health";
		System.out.println(allow);
		{
			String model="Z";
			model=model+" "+store;//space
			System.out.println("model:"+model);
			{
				int no=6;
				int no1=7;
				System.out.println(no+no1);
				int no=6;//error::variable no is already defined in the scope
				no=6;
				
				
			}
			int no=5;//new declaration
			
			
		}
		System.out.println("model:"+model);//
		System.out.println(allow);//works
		
		
	}
	
}


lass AppleRunner{
	public static void main(String[] args)
	{
		String fruit="Mango";
		fruit="Apple";
		String allow=fruit+"is good for health";
		System.out.println(allow);
		{
			String model="Z";
			model=model+" "+store;//space
			System.out.println("model:"+model);
			
			
		}
		{
			
			double height=5.4;
			height=5.6;
			boolean run=false
		}
			int height=5;
			boolean run=true
			System.out.println(height);
			System.out.println(run);
			run=run;//true
			System.out.println(run);//true
			
			
			

		
		
	}
	
}
class kalki{
	public static void movie()
	{
		//local variable::any variable which is declare within the body or method
		//syntax=datatypr varname=value;
		String actor="prabhas";//explit
		System.out.println(actor);
    }
	public static void main(String[] args)
	{
		movie();
		
	}
	
}