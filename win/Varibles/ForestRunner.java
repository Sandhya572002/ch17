class ForestRunner{
	public static void main(String[] forest)
	{
		System.out.println("starts forest in ForestRunner");
		if(forest.length==4)
		{
			String name=forest[0];
			String area=forest[1];
			String establishedYear=forest[2];
			String state=forest[3];
			System.out.println("Name:"+name);
			System.out.println("Area:"+area);
			System.out.println("EstablishedYear:"+establishedYear);
			System.out.println("State:"+state);
		}
		else{
			System.out.println("not enough ref");
		}
		System.out.println("starts forest in ForestRunner");
	}
	
}
//2. Main to take information of a forest: name,area,establishedYear,state