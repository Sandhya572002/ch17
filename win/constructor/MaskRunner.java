class MaskRunner{
	public static void main(String[] agrs)
	{
			Mask masks=new Mask();
			
			Mask mask1=new Mask(20);
			System.out.println("Cost:"+mask1.cost);
			
			Mask mask2=new Mask('m');
			System.out.println("Size:"+mask2.size);
			
			Mask mask3=new Mask("puma");
			System.out.println("Matrial:"+mask3.material);
			
			Mask mask=new Mask(30,'M',"puma");
			System.out.println("Cost:"+mask.cost);
			System.out.println("Size:"+mask.size);
			System.out.println("Matrial:"+mask.material);
			
			Mask mask4=new Mask(10,'S');
			System.out.println("Cost:"+mask4.cost);
			System.out.println("Size:"+mask4.size);
	}

}