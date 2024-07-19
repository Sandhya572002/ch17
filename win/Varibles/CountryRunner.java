class CountryRunner{
	public static void main(String[] args)
	{
		System.out.println("running main in CountryRunner ");
		String[] state={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana",
        "HimachalPradesh","Jharkhand","Karnataka","Kerala","MadhyaPradesh","Maharashtra","Manipur","Meghalaya",
        "MizoramAizawl","Nagaland","Manipur","Odisha","Punjab","Sikkim","TamilNadu","Telangana",
		"Tripura","UttarPradesh","Uttarakhand",	"WestBengal"};
		Country.states(state);
		int[] pins={587316,587124,587315,560091,560030,560007,560045,560086,560050,560070};
		Country.pincode(pins);
		String[] mini={"JawaharLalNehru","GulzarilalNanda","Lal Bahadur Shastri","Gulzari Lal Nanda", 
		"Indira Gandhi","Morarji Desai","Charan Singh","Rajiv Gandhi","V. P. Singh",
		"Chandra Shekhar","P. V. Narasimha Rao","Atal Bihari Vajpayee","H. D. Deve Gowda",
		"Inder Kumar Gujral", "Atal Bihari Vajpayee","Manmohan Singh","Narendra Modi"};
		Country.primeminister(mini);
		String[] cabs={"Shri Rajnath Singh","Shri Amit Shah	","Shri Nitin Jairam Gadkari","Smt. Nirmala Sitharaman","Shri Shivraj Singh Chouhan	",
		"Dr. Subrahmanyam Jaishankar","Shri Jagat Prakash Nadda	","Shri Manohar Lal","Shri H. D. Kumaraswamy","Shri Piyush Goyal","Shri Dharmendra Pradhan	",
		"Shri Jitan Ram Manjhi","Shri Rajiv Ranjan Singh alias Lalan Singh","Shri Sarbananda Sonowal","Dr Virendra Kumar","Shri Kinjarapu Rammohan Naidu",
		"Shri Jual Oram	","Shri Giriraj Singh","Shri Ashwini Vaishnaw","Shri Jyotiraditya M. Scindia","Shri Bhupender Yadav","Shri Sarbananda Sonowal","Shri Gajendra Singh Shekhawat","Smt. Annpurna Devi",
		"Shri Kiren Rijiju","Shri Hardeep Singh Puri","Dr. Mansukh Mandaviya","Shri G. Kishan Reddy","Shri Chirag Paswan","Shri C R Patil"};
		Country.cabinetMinisters(cabs);
		String[] politicals={"Bharatiya Janata Party","Indian National Congress","National People's Party","Aam Aadmi Party","Communist Party Of India"};
		Country.politicalParties(politicals);

	}
}
Above methods print in backward direction

Write a class with main method and pass below info

1. Main to take information of a person: name,email,age,password
2. Main to take information of a forest: name,area,establishedYear,state
3. Main to take information of a palace: name,location,builtBy,buildYear

