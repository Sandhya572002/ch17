class SpeakerRunner{
	public static void main(String[] agrs)
	{
		Speaker speaker=new Speaker("puma");
		speaker.setCost(35);
		speaker.output=true;
		speaker.display();
		System.out.println("-----------------");
		
		Speaker speaker1=new Speaker("zara");
		speaker1.setCost(45);
		speaker1.output=false;
		speaker1.display();
		System.out.println("-----------------");
		
		Speaker speaker2=new Speaker("cream");
		speaker2.setCost(55);
		speaker2.output=false;
		speaker2.display();
		System.out.println("-----------------");
	}
	
}