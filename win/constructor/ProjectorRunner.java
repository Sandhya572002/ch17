class ProjectorRunner{
	public static void main(String[] agrs)
	{
		Projector projector=new Projector("wireless");
		projector.weight=100;
		projector.setProjector("red");
		projector.display();
		System.out.println("-----------------");
		
		Projector projector1=new Projector("wire");
		projector1.weight=200;
		projector1.setProjector("black");
		projector1.display();
		System.out.println("-----------------");
		
		Projector projector2=new Projector("without wireless");
		projector2.weight=300;
		projector2.setProjector("white");
		projector2.display();
		System.out.println("-----------------");
		
	}

}