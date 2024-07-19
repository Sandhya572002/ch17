class GroceryRunner{
	public static void main(String[] args){
		String vegetable="onion";
		String vegetable1="Tomato";
		String teaPowder="red lsbel";
		//ref:elements
		String[]values={vegetable,vegetable1,"sugar--im"};
		int total=values.length;
		System.out.println("itams:"+total);
		String ref=values[2];
		System.out.println("elemnt At index 4:"+ref);
		String ref=values[2];//array out of the index
		//rray Indexoutofbound::when we axszin index which does not exit
		
		
		
	}
}