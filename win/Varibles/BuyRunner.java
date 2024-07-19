class BuyRunner{
	public static void main(String[] values)
	{
		System.out.println("running main in BuyRunner");
		Buy.product("Lee",15);
		Buy.product("lol",-200);
		Buy.product("sandhya",27,"good",600);
		Buy.product("usha",790,"bad",963);
		Buy.bookMovieTicket("happy","lulutheater",678,111);
		Buy.bookMovieTicket("kalki","ramatheater",690,678);
		Buy.buyEgg(700,23.5);
		Buy.buyEgg(1200,93.5);
		Buy.buyShampoo(40,67.7,"skned","sand");
		Buy.buyShampoo(80,89.7,"cases","allow");
		Buy.buyCake('Y',"watch","chocolate",54.3,67);
		Buy.buyCake('F',"ROM","starberry",89.0,89);
		Buy.buyLaptop("facebook",10,56.7,90,90.0,"window",7,300);
		Buy.buyLaptop("sony",90,78.7,770,89.0,"linx",10,890);
		Buy.buySmartWatch("max",90,3,'R',10);
		Buy.buySmartWatch("min",70,15,'K',80);

		

	}
}