// -----------------------------------------------------
// Assigment 2 Part 1
// Written by: (Imran Ahmed 40172931)
// -----------------------------------------------------

package Package1;


import Package2.EmailAddress;

import Package2.TelecomAddress;
import Package2.WebPageAddress;
import Package3.GeneralDeliveryAddress;
import Package3.GeographicAddress;
import Package3.PostOfficeBoxAddress;



public class AddressTypePart2 {
	
	//CopyAddress method using the copy constructor
	public static Address[] copyAddress(Address[] a) {
			Address [] copy = new Address[a.length];
		
			for (int i = 0 ; i < a.length ; i++) {
				copy[i] = new Address(a[i]);
			}
				return copy;
	}

	public static void main(String[] args) {
		
		//Creating a array of address
		Address [] listofaddress = new Address [15];
		
		listofaddress[0] = new WebPageAddress("www.montreal/ressource","2017-05-24","2019-03-01");
		listofaddress[1] = new WebPageAddress("www.google/ressource","2020-12-24","2021-03-01");
		listofaddress[2] = new EmailAddress("2021-01-28","2021-04-01","James","hotmail","com");
		listofaddress[3] = new TelecomAddress("2022-02-28","2023-08-01", "+1", "0" , 208, 5887456, 711, "fax");
		listofaddress[4] = new GeographicAddress("2021-12-24","2021-12-28", "218 Street Mary", "Brooklyn", "New York", "10001", "US" , 840 , "The United States of America");
		listofaddress[5] = new PostOfficeBoxAddress ("2021-02-26","2021-03-24","214 Côte-des-Neiges","Montreal", "Quebec", "H3X 1S2", "CA", 124 , "Canada", 1289);
		listofaddress[6] = new GeneralDeliveryAddress ("1995-02-28","1998-06-13", "+1", "0" , 208, 3854897, 889, "mobile", "258 Saint-Laurent" , "Montreal ", "Quebec", "H4K 1K2");
		listofaddress[7] = new TelecomAddress("2021-01-15","2021-02-25", "+1", "0" , 315, 5844587, 987, "pager");
		listofaddress[8] = new WebPageAddress("www.youtube/ressource","2021-08-24","2022-03-08");
		listofaddress[9] = new EmailAddress("2021-02-15","2021-12-15","Kevin","gmail","com");
		listofaddress[10] = new TelecomAddress("2021-07-28","2022-05-01", "+1", "0" , 208, 854784, 856, "mobile");
		listofaddress[11] = new GeographicAddress("2019-02-24","2021-01-08", "218 Street Mary", "Brooklyn", "New York", "10001", "US" , 840 , "The United States of America");
		listofaddress[12] = new PostOfficeBoxAddress ("2005-01-26","2008-03-24","2584 Rue La Voie","Montreal", "Quebec", "H3J 1L2", "CA", 124 , "Canada", 8745);
		listofaddress[13] = new GeneralDeliveryAddress ("1998-02-28","2021-06-13", "+1", "0" , 514, 3854487, 889, "fax", "2148 Dupuis" , "Montreal ", "Quebec", "H32 1K4");
		listofaddress[14] = new WebPageAddress("www.concordia/ressource","1885-01-18","2021-04-21");
		
		//Displaying the array of address
		for (int i = 0 ; i < listofaddress.length ; i++) {
			System.out.println(listofaddress[i]);
		}
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Attempting to copy the list of addresses using the copyAddress method");
		
		//Using the copyaddress method to copy a array of address
		Address [] Addresedcopied = AddressTypePart2.copyAddress(listofaddress);
		for (int i = 0 ; i < listofaddress.length ; i++) {
			System.out.println(Addresedcopied[i]);
		}
		System.out.println();
		
		System.out.println("The copying above is obviously not corrected, Not only did it create only address classes, but the dates are also completely wrong. This occured because polymorphism did not trigger");
		System.out.println("Polymorphism is triggered when there is inheritance, overiding and a confusing casting and it works by late binding, which is replacing the code with correct (child) code.");
		System.out.println("The copy constructor will not have the method overiiden since all copy constructor do not have the same name. For example the copy constructor of Webpage address and Email Address");
		System.out.println("do not have the same name thus,polymorphism does not trigger since the methods are not overriden.");
		
		
	}
	
	
	
	

}
