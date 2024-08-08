class KeybunchRunner{
	public static void main(String[] values)
	{
		Key key=new Key(15.5,"puma");
		Keybunch keybunch= new Keybunch("steel",key);
		keybunch.details();
		
		
		Key key1=new Key(31.1,"zara");
		Keybunch keybunch1=new Keybunch("plastic",key1);
		keybunch1.details();
		
				
	}
}