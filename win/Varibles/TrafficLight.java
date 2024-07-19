class TrafficLight{
	public static void main(String[] traffics)
	{
	
		System.out.println("starts States in Country");
		if(traffics.length==3)
		{
			
		
		String location=traffics[0];//wn we acessthe index dont not exits
		String automactic=traffics[1];
		String working=traffics[2];
		System.out.println("location:"+location);
		System.out.println("automactic:"+automactic);
		System.out.println("working:"+working);
		
		}
		else{
			System.out.println("not enough ref");
		}
		
		System.out.println("ends States in Country");
		

	}
}