class Buy{
	public static void product(String brand,double price )
	{
		System.out.println("---------------------------------------------");
		System.out.println("running product in Buy with two parameters");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		if(price>10&&price<20)
		{
			System.out.println("price is valid");
			
		}
		else
		{
			System.out.println("price is In-valid");
		}
	}
	public static void product(String name,int quantity,String quatity,double price)
	{
		System.out.println("---------------------------------------------");
		System.out.println("running product in Buy with three parameters");
		System.out.println("name:"+name);
		System.out.println("quantity:"+quantity);
		System.out.println("quatity:"+quatity);
		System.out.println("price:"+price);
		if(quantity>25&&quantity<=100)
		{
			System.out.println("quantity is valid");
			
		}
		else
		{
			System.out.println("quantity is In-valid");
		}
	}
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
	{
		System.out.println("---------------------------------------------");
		System.out.println("running bookMovieTicket in Buy with four parameters");
		System.out.println("name:"+name);
		System.out.println("theaterName:"+theaterName);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		if(price>100&&price<200)
		{
			System.out.println("price is valid");
			
		}
		else
		{
			System.out.println("price is In-valid");
		}
	}
	public static void buyEgg(int total,double pricePerEgg)
	{
		System.out.println("---------------------------------------------");
		System.out.println("running buyEgg in Buy with two parameters");
		System.out.println("total:"+total);
		System.out.println("pricePerEgg:"+pricePerEgg);
	
		if(total>678&&total<=1000)
		{
			System.out.println("total is valid");
			
		}
		else
		{
			System.out.println("total is In-valid");
		}
	}
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
	{
		System.out.println("---------------------------------------------");
		System.out.println("running buyShampoo in Buy with four parameters");
		System.out.println("quantityInMl:"+quantityInMl);
		System.out.println("price:"+price);
			System.out.println("brand:"+brand);
		System.out.println("manfDate:"+manfDate);
	
		if(quantityInMl>30&&quantityInMl<=50)
		{
			System.out.println("quantityInMl is valid");
			
		}
		else
		{
			System.out.println("quantityInMl is In-valid");
		}
	}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity)
	{
		System.out.println("---------------------------------------------");
		System.out.println("running buyCake in Buy with five parameters");
		System.out.println("size:"+size);
		System.out.println("type:"+type);
		System.out.println("flavour:"+flavour);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
	
		if(cost>10.1&&cost<60.9)
		{
			System.out.println("cost is valid");
			
		}
		else
		{
			System.out.println("cost is In-valid");
		}
	}
		public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
	{
		System.out.println("---------------------------------------------");
		System.out.println("running buyLaptop in Buy with five parameters");
		System.out.println("brand:"+brand);
		System.out.println("serialNo:"+serialNo);
		System.out.println("price:"+price);
		System.out.println("batteryCapacity:"+batteryCapacity);
		System.out.println("screenSize:"+screenSize);
		System.out.println("os:"+os);
		System.out.println("harddiskSize:"+harddiskSize);
		System.out.println("ramSize:"+ramSize);

		if(ramSize>250&&ramSize<400)
		{
			System.out.println("ramSize is valid");
			
		}
		else
		{
			System.out.println("ramSize is In-valid");
		}
	}
        public static void buySmartWatch(String brand,double price,int color,char type,int mode)
	{
		System.out.println("---------------------------------------------");
		System.out.println("running buyLaptop in Buy with five parameters");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("mode:"+mode);

		if(color>1&&color<10)
		{
			System.out.println("color is valid");
			
		}
		else
		{
			System.out.println("color is In-valid");
		}
	}

}

