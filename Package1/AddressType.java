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

public class AddressType {

	public static void main(String[] args) {
		
		//Creating two email address objects
		EmailAddress e1 = new EmailAddress("2021-12-28","2021-12-30","Mario","hotmail","com");
		System.out.println(e1);
		EmailAddress e2 = new EmailAddress("2021-12-28","2021-12-30","Mario","hotmail","com");
		System.out.println(e2);
		
		//Comparing the two email address objects
		if (e1.equals(e2)) {
			System.out.println("Email addresses above are equal");
		}
		else
			System.out.println("Email addresses above are not equal");
		System.out.println();
			
		//Creating two web page address objects
		WebPageAddress w1 = new WebPageAddress("www.google/ressource","2021-02-24","2021-03-01");
		System.out.println(w1);
		WebPageAddress w2 = new WebPageAddress("www.concordia/ressource","2022-06-26","2022-12-08");
		System.out.println(w2);
	
		//Comparing the web page address objects
		if (w1.equals(w2)) {
			System.out.println("The Web Page Addresses above are equal");
		}
		else
			System.out.println("The Web Page Addresses above are not  equal");
		System.out.println();
		
		//Creating two telecom address objects
		TelecomAddress t1 = new TelecomAddress("2021-02-28","2025-07-01", "+1", "0" , 514, 5887456, 911, "mobile");
		System.out.println(t1);
		TelecomAddress t2 = new TelecomAddress("2021-02-28","2021-04-01", "+1", "0" , 208, 5887456, 711, "fax");
		System.out.println(t2);
	
		//Comparing the telecom address objects
		if(t1.equals(t2)) {
			System.out.println("The Telecom Addresses above are equal");
		}
		else
			System.out.println("The telecom Addresses above are not equal");
		System.out.println();
		
		//Creating two geographic address objects
		GeographicAddress g1 = new GeographicAddress("2021-02-24","2021-03-01", "218 Street Mary", "Brooklyn", "New York", "10001", "US" , 840 , "The United States of America");
		System.out.println(g1);
		GeographicAddress g2 = new GeographicAddress("2021-02-24","2021-03-01", "218 Street Mary", "Brooklyn", "New York", "10001", "US" , 840 , "The United States of America");
		System.out.println(g2);
	
		
		//Comparing two geographic address objects
		if(g1.equals(g2)) {
			System.out.println("The Geographic Addresses above are equal");
		}
		else
			System.out.println("The Geographic Addresses above are not equal");
		System.out.println();
		
		//Comparing two post office box address objects
		PostOfficeBoxAddress p1 = new PostOfficeBoxAddress ("2021-02-26","2021-03-24","214 Côte-des-Neiges","Montreal", "Quebec", "H3X 1S2", "CA", 124 , "Canada", 1289);
		System.out.println(p1);
		PostOfficeBoxAddress p2 = new PostOfficeBoxAddress ("2021-02-26","2021-03-24","214 Côte-des-Neiges","Montreal", "Quebec", "H3X 1S2", "CA", 124 , "Canada", 1289);
		System.out.println(p2);
		
		//Comparing two post office box address objects 
		if(p1.equals(p2)) {
			System.out.println("The PostOfficeBox Addresses above are equal");
		}
		else
			System.out.println("The PostOfficeBox Addresses above are not equal");
		System.out.println();
		
		//Creating two general delivery address objects
		GeneralDeliveryAddress gd1 = new GeneralDeliveryAddress ("2021-02-28","2022-06-13", "+1", "0" , 208, 3854897, 889, "mobile", "258 Saint-Laurent" , "Montreal ", "Quebec", "H4K 1K2");
		System.out.println(gd1);
		GeneralDeliveryAddress gd2 = new GeneralDeliveryAddress ("2021-01-13","2021-06-13", "+1", "0" , 514, 7331312, 845, "pager", "258 Rue Champlain" , "Montreal ", "Quebec", "H4K 1J2");
		System.out.println(gd2);
		
		//Comparing two general delivery address objects
		if(gd1.equals(gd2)) {
			System.out.println("The GeneralDelivery Addresses above are equal");
		}
		else
			System.out.println("The GeneralDelivery Addresses above are not equal");
		System.out.println();
		
		//Comparing a postofficeaddress object and georgraphic address object
		if(p1.equals(g1)) {
			System.out.println("The PostOffice1 and Gegraphic1 Addresseses are equal");
		}
		else
			System.out.println("The PostOffice1 and Gegraphic1 Addresseses are not equal");
		
		System.out.println("-----------------------------------------------------------------------------------------");
		
		
		System.out.println("These are the addresses which will be in the array to test if they are obsolete or not");
		
		//Creating a array of address of length 15
		Address [] listofaddress = new Address [15];
		
		//Initalizign all index of the array to one of the type of address
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
		listofaddress[12] = new PostOfficeBoxAddress ("2021-04-26","2021-08-13","2584 Rue La Voie","Montreal", "Quebec", "H3J 1L2", "CA", 124 , "Canada", 8745);
		listofaddress[13] = new GeneralDeliveryAddress ("1998-02-28","2021-06-13", "+1", "0" , 514, 3854487, 889, "fax", "2148 Dupuis" , "Montreal ", "Quebec", "H32 1K4");
		listofaddress[14] = new WebPageAddress("www.concordia/ressource","1885-01-18","2021-04-21");
		
		//Displaying the addresses 
		for (int i = 0 ; i < listofaddress.length ; i++) {
			System.out.println("("+i+") "+listofaddress[i]);
		}
		
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("The adddress must be valid to 2021-02-25");
		System.out.println("The obsolete addreses are :");
		AddressType.traceObsoleteAddress(listofaddress, 2021, 2,25 );
		
		
		
	}
	//Traceobsolete method which will display address that are obsolete
	public static void traceObsoleteAddress(Address [] a , int year , int month , int day ) {
		
		for (int i = 0 ; i < a.length ; i++) {
		String validFrom = a[i].getValidFrom();
		String validTo = a[i].getValidTo();
		
		String yearofaddressFrom = validFrom.substring(0,4);
		String monthofaddressFrom = validFrom.substring(5,7);
		String dayofaddressFrom = validFrom.substring(8);
		String yearofaddressTo = validTo.substring(0,4);
		String monthofaddressTo = validTo.substring(5,7);
		String dayofaddressTo = validTo.substring(8);
		
		
		
		int yearFrom = Integer.parseInt(yearofaddressFrom);
		int yearTo = Integer.parseInt(yearofaddressTo);
		
		int dayFrom;
		int dayTo;
		
		if (dayofaddressFrom.substring(0,1) == "0") {
			String dayisnow = dayofaddressFrom.substring(1);
			dayFrom = Integer.parseInt(dayisnow);
		}
		else
			dayFrom = Integer.parseInt(dayofaddressFrom);
		
		if (dayofaddressTo.substring(0,1)== "0") {
			String dayisnow = dayofaddressTo.substring(1);
			dayTo = Integer.parseInt(dayisnow);
		}
		else
			dayTo = Integer.parseInt(dayofaddressTo);
		
		int monthFrom;
		int monthTo;
		
		if (monthofaddressFrom.substring(0,1) == "0") {
			String monthisnow = monthofaddressFrom.substring(1);
			monthFrom = Integer.parseInt(monthisnow);
		}
		else
			monthFrom = Integer.parseInt(monthofaddressFrom);
		
		if (monthofaddressTo.substring(0,1)== "0") {
			String monthisnow = monthofaddressTo.substring(1);
			monthTo = Integer.parseInt(monthisnow);
		}
		else
			monthTo = Integer.parseInt(monthofaddressTo);
		
		
		
		if (yearFrom < year && yearTo > year) { 
		}
		else if (yearFrom > year) {
			System.out.println("the address --> \""+a[i]+"\" at location "+i+" is a obsolete address"); //If yearFrom is greater than the year
		}
		else if (yearTo < year) {
			System.out.println("the address --> \""+a[i]+"\" at location "+i+" is a obsolete address");// if yearTo is less than the year 
		}
		else if (monthTo < month && year == yearTo) {
			System.out.println("the address --> \""+a[i]+"\" at location "+i+" is a obsolete address");// if yearTo is the same as the year and monthTo is less than the month
		}
		else if (yearFrom == year && monthTo < month && yearTo == year) {
			System.out.println("the address --> \""+a[i]+"\" at location "+i+" is a obsolete address");// if the address is is valid trough the same year is the given address and month is greater than monthTo
		}
		else if (yearFrom == year && monthFrom > month) {
			System.out.println("the address --> \""+a[i]+"\" at location "+i+" is a obsolete address");// if yearfrom is same as year and monthfrom greater than month
		}
		else if (yearFrom == year && monthFrom == month && dayFrom > day) {
			System.out.println("the address --> \""+a[i]+"\" at location "+i+" is a obsolete address");// if yearfrom is same as year, monthFrom same as month and dayFrom greater than day
		}
		else if (yearTo == year && monthTo == month && day > dayTo ) {
			System.out.println("the address --> \""+a[i]+"\" at location "+i+" is a obsolete address");// if yearTo is same as year, monthTo same as month and dayTo less than day
		}
		
		
		
	}
				
		
}
	
	
	
	
	

}
