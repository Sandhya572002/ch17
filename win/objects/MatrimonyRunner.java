class MatrimonyRunner{
	public static void main(String arg[])
	{
		System.out.println("start main in Matrimony");
		Matrimony matrimony=new Matrimony();
		String matrimonyname=matrimony.matrimonyname;
		int logintime=matrimony.logintime;
	    int cost=matrimony.cost;
		System.out.println("Matrimonyname:"+matrimonyname);
		System.out.println("Logintime:"+logintime);
		System.out.println("Cost:"+cost);
		matrimony.matrimonyname="asdfg";
		matrimony.logintime=3;
		matrimony.cost=7;
		System.out.println("Updated Matrimonyname:"+matrimony.matrimonyname);
		System.out.println("Updated Logintime:"+matrimony.logintime);
		System.out.println("Updated Cost:"+matrimony.cost);
		System.out.println("end main in Matrimony");
	
	
		System.out.println("#########################################");
		System.out.println("start main in Application");
		Application application=new Application();
		String applicationame=application.applicationame;
		String phonepay=application. phonepay;
	    double prices=application.prices;
		System.out.println("applicationame:"+applicationame);
		System.out.println(" phonepay:"+ phonepay);
		System.out.println("prices:"+prices);
		application.applicationame="navi";
		application. phonepay="yes";
		application.prices=123;
		System.out.println("Updated Matrimonyname:"+application.applicationame);
		System.out.println("Updated Logintime:"+application. phonepay);
		System.out.println("Updated Cost:"+application.prices);
		System.out.println("end main in Application");
		

		
		System.out.println("#########################################");
		System.out.println("start main in Fruit");
		Fruit fruit=new Fruit();
		String fruitname=fruit.fruitname;
		String colour=fruit. colour;
	    double price=fruit.price;
		System.out.println("fruitname:"+fruitname);
		System.out.println(" colour:"+ colour);
		System.out.println("prices:"+price);
		fruit.fruitname="apple";
		fruit. colour="red";
		fruit.price=350;
		System.out.println("Updated fruitname:"+fruit.fruitname);
		System.out.println("Updated colour:"+fruit. colour);
		System.out.println("Updated price:"+fruit.price);
		System.out.println("end main in Fruit");
		
		System.out.println("#########################################");
		System.out.println("start main in Place");
		Place place=new Place();
		String placename=place.placename;
		String area=place. area;
	    String wether=place.wether;
		System.out.println("placename:"+placename);
		System.out.println(" area:"+ area);
		System.out.println("wether:"+wether);
		place.placename="park";
		place. area="tc palya";
		place.wether="cold";
		System.out.println("Updated placename:"+place.placename);
		System.out.println("Updated area:"+place. area);
		System.out.println("Updated wether:"+place.wether);
		System.out.println("end main in Place");
		
		
		
		System.out.println("#########################################");
		System.out.println("start main in AlcoholBrand");
		AlcoholBrand alcoholBrand=new AlcoholBrand();
		String alcoholBrandname=alcoholBrand.alcoholBrandname;
		String type=alcoholBrand. type;
	    int costes=alcoholBrand.costes;
		System.out.println("applicationame:"+applicationame);
		System.out.println(" phonepay:"+ phonepay);
		System.out.println("cost:"+costes);
		alcoholBrand.alcoholBrandname="navi";
		alcoholBrand. type="yes";
		alcoholBrand.costes=123;
		System.out.println("Updated alcoholBrandname:"+alcoholBrand.alcoholBrandname);
		System.out.println("Updated type:"+alcoholBrand. type);
		System.out.println("Updated Cost:"+alcoholBrand.costes);
		System.out.println("end main in AlcoholBrand");
		

		
		System.out.println("#########################################");
		System.out.println("start main in Candy");
		Candy candy=new Candy();
		String candyname=candy.candyname;
		String fav=candy. fav;
	    double costs=candy.costs;
		System.out.println("fruitname:"+fruitname);
		System.out.println(" colour:"+ colour);
		System.out.println("costs:"+costs);
		candy.candyname="starbetty";
		candy. fav="chocolate";
		candy.costs=567;
		System.out.println("Updated fruitname:"+candy.candyname);
		System.out.println("Updated colour:"+candy. fav);
		System.out.println("Updated costs:"+candy.costs);
		System.out.println("end main in Candy");
		
		
		
		
		

		
		System.out.println("#########################################");
		System.out.println("start main in Medicine");
		Medicine medicine=new Medicine();
		String Medicinename=medicine.Medicinename;
		String brand=medicine. brand;
	    double money=medicine.money;
		System.out.println("Medicinename:"+Medicinename);
		System.out.println(" brand:"+ brand);
		System.out.println("money:"+money);
		medicine.Medicinename="dolo";
		medicine. brand="string";
		medicine.money=90;
		System.out.println("Updated Medicinename:"+medicine.Medicinename);
		System.out.println("Updated brand:"+medicine. brand);
		System.out.println("Updated money:"+medicine.money);
		System.out.println("end main in Medicine");
		
		

		System.out.println("#########################################");
		System.out.println("start main in Food");
		Food food=new Food();
		String foodname=food.foodname;
		String foodstreeet=food. foodstreeet;
	    double foodcost=food.foodcost;
		System.out.println("foodname:"+foodname);
		System.out.println(" foodstreeet:"+ foodstreeet);
		System.out.println("foodcost:"+foodcost);
		food.foodname="dosa";
		food. foodstreeet="kr puram";
		food.foodcost=80;
		System.out.println("Updated foodname:"+food.foodname);
		System.out.println("Updated foodstreeet:"+food. foodstreeet);
		System.out.println("Updated foodcost:"+food.foodcost);
		System.out.println("end main in Food");


		
	}
}

		
		