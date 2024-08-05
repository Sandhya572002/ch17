class PaperRunner{
	public static void main(String[] agrs)
	{
		Paper paper=new Paper("medium");
		paper.color="red";
		paper.setPaper("good");
		paper.display();
		System.out.println("--------------");
		
		Paper paper1=new Paper("small");
		paper1.color="=white";
		paper1.setPaper("very good");
		paper1.display();
		System.out.println("--------------");
		
		Paper paper2=new Paper("big");
		paper2.color="black";
		paper2.setPaper("bad");
		paper2.display();
		System.out.println("--------------");
	}

}