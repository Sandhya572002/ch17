class RoomRunner{
	public static void main(String[] args)
	{
		System.out.println("running main in RoomRunner");
		double ref=Room.hater("dolo");
		System.out.println("return type price:"+ref);
		ref=Room.hater("diclofenac");
		System.out.println("return type price:"+ref);
		ref=Room.hater("paracetamol");
		System.out.println("return type price:"+ref);
		ref=Room.hater("fitrgb");
		System.out.println("return type price:"+ref);
		
		
		
		String value=Room.cases("cold");
		System.out.println("return type medicineName:"+value);
		value=Room.cases("fever");
		System.out.println("return type medicineName:"+value);
		value=Room.cases("headcahe");
		System.out.println("return type medicineName:"+value);
		value=Room.cases("leg pain");
		System.out.println("return type medicineName:"+value);
		
		
		
		boolean values=Room.lower("sindhu");
		System.out.println("return type availability:"+values);
		values=Room.lower("jack");
		System.out.println("return type availability:"+values);
		values=Room.lower("virat");
		System.out.println("return type availability:"+values);
		values=Room.lower("krishna");
		System.out.println("return type availability:"+values);	
		
		
	
	}
},