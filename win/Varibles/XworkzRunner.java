class XworkzRunner{
	public static void main(String[] args){
	System.out.println("running main in XworkzRunner ");
	String country=Xworkz.allow(93);
	System.out.println("return type country:"+country);
	country=Xworkz.allow(355);
	System.out.println("return type country:"+country);
	country=Xworkz.allow(91);
	System.out.println("return type country:"+country);
	country=Xworkz.allow(354);
	System.out.println("return type country:"+country);
	country=Xworkz.allow(86);
	System.out.println("return type country:"+country);
	country=Xworkz.allow(90);
	System.out.println("return type country:"+country);
	
	
    double ref=Xworkz.better("panner");
	System.out.println("return type Price:"+ref);
	ref=Xworkz.better("biriyani");
	System.out.println("return type Price:"+ref);
	ref=Xworkz.better("kebab");
	System.out.println("return type Price:"+ref);
	ref=Xworkz.better("rice");
	System.out.println("return type Price:"+ref);
	ref=Xworkz.better("dosa");
	System.out.println("return type Price:"+ref);
	ref=Xworkz.better("puri");
	System.out.println("return type Price:"+ref);
	
	
	String movie=Xworkz.good("hello");
	System.out.println("return type producer Name:"+movie);
	movie=Xworkz.good("utra");
	System.out.println("return type producer Name:"+movie);
	movie=Xworkz.good("power");
	System.out.println("return type producer Name:"+movie);
	movie=Xworkz.good("wonder");
	System.out.println("return type producer Name:"+movie);
	movie=Xworkz.good("liger");
	System.out.println("return type producer Name:"+movie);
	movie=Xworkz.good("pushpa");
	System.out.println("return type producer Name:"+movie);
	
	







}
}


//B. Write a class with below methods
//1.Method to take medicineName and return price : 3 condition
//2.Method to take symptom and return medicineName: 3 condition
//3.Method to take doctor name and return availability:3 condition