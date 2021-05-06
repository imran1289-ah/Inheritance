// -----------------------------------------------------
// Assigment 2 Part 1
// Written by: (Imran Ahmed 40172931)
// -----------------------------------------------------

package Package3;

import Package1.Address;


class Locale{
	private String two_letter_cc;
	private int num_cc;
	private String Eng_lang_cn;
	
	/**
	 * Default constructor of the Locale class. Initializes all instance variables to empty strings or 0
	 */
	public Locale () {
		two_letter_cc = "";
		num_cc = 0;
		Eng_lang_cn = "";
	}
	
	/**
	 * Parameterized constructor of the Locale class. Initializes all instance variables with their respective parameters
	 * @param two_letter_cc
	 * @param num_cc
	 * @param Eng_lang_cn
	 */
	public Locale(String two_letter_cc , int num_cc , String Eng_lang_cn) {
		this.two_letter_cc = two_letter_cc;
		this.num_cc = num_cc;
		this.Eng_lang_cn = Eng_lang_cn;
	}
	
	/**
	 * Copy constructor of the locale class
	 * @param l locale
	 */
	public Locale(Locale l) {
		two_letter_cc = l.two_letter_cc;
		num_cc = l.num_cc;
		Eng_lang_cn = l.Eng_lang_cn;
	}
	
	/**
	 * Mutator method for the two letter country code
	 * @param two_letter_cc
	 */
	public void setCC(String two_letter_cc) {
		this.two_letter_cc = two_letter_cc;
	}
	
	/**
	 * Accessor method for the two letter country code
	 * @return two letter country code
	 */
	public String getCC() {
		return two_letter_cc;
	}
	
	/**
	 * Mutator method for the numeric country code
	 * @param num_cc
	 */
	public void setNumcc(int num_cc) {
		this.num_cc = num_cc;
	}
	
	/**
	 * Accessor method for the numeric country code
	 * @return numeric country code
	 */
	public int getNumcc() {
		return num_cc;
	}
	
	/**
	 * Mutator method for English language country name
	 * @param Eng_lang_cn
	 */
	public void setEn_lang(String Eng_lang_cn) {
		this.Eng_lang_cn = Eng_lang_cn;
	}
	
	/**
	 * Accessor method for the English language country name
	 * @return english language country name
	 */
	public String getEn_lang() {
		return Eng_lang_cn;
	}
	
}


public class GeographicAddress extends Address {
					
			protected String addressLine;
			protected String city;
			protected String regionOrState;
			protected String zipOrpostcode;
			protected Locale locale;
			
			
			/**
			 * Default constructor of the geographic address
			 */
			public GeographicAddress() {
				addressLine = "";
				city = "";
				regionOrState = "";
				zipOrpostcode = "";
				locale = new Locale();
			}
			
			/**
			 * Parameterized constructor of the geographic address
			 * @param validF
			 * @param validT
			 * @param addressLine
			 * @param city
			 * @param regionOrState
			 * @param zipOrpostcode
			 * @param two_letter_cc
			 * @param num_cc
			 * @param Eng_lang_cn
			 */
			public GeographicAddress(String validF, String validT, String addressLine, String city, String regionOrState, String zipOrpostcode, String two_letter_cc , int num_cc , String Eng_lang_cn) {
				super(validF,validT);
				this.addressLine = addressLine;
				this.city = city;
				this.regionOrState = regionOrState;
				this.zipOrpostcode = zipOrpostcode;
				locale = new Locale(two_letter_cc ,num_cc ,Eng_lang_cn);
			}
			
			/**
			 * Copy constructor of the geographic address
			 * @param a address
			 * @param g geograhpicaddress
			 */
			public GeographicAddress(Address a, GeographicAddress g) {
				super(a);
				addressLine = g.addressLine;
				city = g.city;
				regionOrState = g.regionOrState;
				zipOrpostcode = g.zipOrpostcode;
				locale = g.locale;
			}
			
			/**
			 * Mutator method of the address line
			 * @param addressLine
			 */
			public void setAddressLine(String addressLine) {
				this.addressLine = addressLine;
			}
			
			/**
			 * Accessor method of the address line
			 * @return address line
			 */
			public String getAddressLine() {
				return addressLine;
			}
			
			/**
			 * Mutator method of the city
			 * @param city
			 */
			public void setCity(String city) {
				this.city = city;
			}
			
			/**
			 * Accessor method of the city 
			 * @return city 
			 */
			public String getCity() {
				return city;
			}
			
			/**
			 * Mutator method of the region or state
			 * @param regionOrState
			 */
			public void setRegionOrState(String regionOrState) {
				this.regionOrState = regionOrState;
			}
			
			/**
			 * Accessor method of the region or state
			 * @return region or state
			 */
			public String getRegionOrState() {
				return regionOrState;
			}
			
			/**
			 * Mutator method of the zip or postcode
			 * @param zipOrpostcode
			 */
			public void setZipOrPostcode(String zipOrpostcode) {
				this.zipOrpostcode =zipOrpostcode;
			}
			
			/**
			 * Accessor method of the zip or postcode
			 * @return zip or postcode
			 */
			public String getZipOrPostcode() {
				return zipOrpostcode;
			}
			
			/**
			 * Mutator method of the two letter country code
			 * @param two_letter_cc
			 */
			public void setCC(String two_letter_cc) {
				locale.setCC(two_letter_cc);
			}
			
			/**
			 * Accessor method of the two letter country code
			 * @return two letter country code
			 */
			public String getCC() {
				return locale.getCC();
			}
			
			/**
			 * Mutatator method of the nuemric country code
			 * @param num_cc
			 */
			public void setNumcc(int num_cc) {
				locale.setNumcc(num_cc);
			}
			
			/**
			 * Accessor method of the numeric country code
			 * @return
			 */
			public int getNumcc() {
				return locale.getNumcc();
			}
			
			/**
			 * Mutator method of the english language country name
			 * @param Eng_lang_cn
			 */
			public void setEn_lang(String Eng_lang_cn) {
				locale.setCC(Eng_lang_cn);
			}
			
			/**
			 * Accessor method of the english language country name
			 * @return english language country name
			 */
			public String getEn_lang() {
				return locale.getEn_lang();
			}
			
			/**
			 * equals method which takes a parameter which is any object and attempts to check if they are equal
			 * @param Object
			 */
			public boolean equals(Object x) {
				if (x == null || this == null || this.getClass() != x.getClass()) {
					return false;
				}
				else
				{
					GeographicAddress g = (GeographicAddress)x;
					return (this.addressLine == g.addressLine && this.city == g.city && this.regionOrState == g.regionOrState && this.zipOrpostcode == g.zipOrpostcode && this.getCC() == g.getCC() && this.getNumcc() == g.getNumcc() && this.getEn_lang() == g.getEn_lang() && this.getValidFrom() == g.getValidFrom() && this.getValidTo() == g.getValidTo());
				}
			}
			
			/**
			 * toString method to return a string containing the informations of the GeographicAddress class
			 */
			public String toString() {
				return "The Geographic address given is "+addressLine+" "+city+" "+regionOrState+" "+zipOrpostcode+" \""+locale.getCC()+"\" "+locale.getNumcc()+" \""+locale.getEn_lang()+"\"and "+"it is valid from "+getValidFrom() + " to "+getValidTo();
			}
			
			
}
