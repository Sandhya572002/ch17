class TrainRunner{
	public static void main(String[] args){
		Train.book("bagepalli","banglore");
		Train.book("tcpalya","krpuram",1000);
		Train.book("majestic","hostoke",34567,79000);
		Train.cancel(88);
		Train.cancel("IT Gate","Tinfactory");
	}
}
