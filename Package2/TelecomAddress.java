// -----------------------------------------------------
// Assigment 2 Part 1
// Written by: (Imran Ahmed 40172931)
// -----------------------------------------------------

package Package2;

import Package1.Address;

public class TelecomAddress extends Address {
			
		
			
			protected String countryCode;
			protected String NDD;
			protected int areaCode;
			protected long number;
			protected int extension;
			protected String PhysicalType;
			
			/**
			 * The constructor of the TelecomAddress class. Initializes all instance variables to 0 or empty strings
			 */
			public TelecomAddress() {
				countryCode = "";
				NDD = "";
				areaCode = 0;
				number = 0;
				extension = 0;
				PhysicalType = "";
			}
			
			/**
			 * The parameterized constructor of the TelecomAddress class. Initializes all instance variables with their respective parameters
			 * @param validF
			 * @param validT
			 * @param countryCode
			 * @param NDD
			 * @param areaCode
			 * @param number
			 * @param extension
			 * @param PhysicalType
			 */
			public TelecomAddress(String validF, String validT, String countryCode, String NDD , int areaCode, long number, int extension, String PhysicalType) {
				super(validF,validT);
				this.countryCode = countryCode;
				this.NDD = NDD;
				this.areaCode = areaCode;
				this.number = number;
				this.extension = extension;
				this.PhysicalType = PhysicalType;
			}
			
			
			/**
			 * The copy constructor of the TelecomAddress
			 * @param a address
			 * @param t telecomaddress
			 */
			public TelecomAddress(Address a , TelecomAddress t) {
				super(a);
				countryCode = t.countryCode;
				NDD = t.NDD;
				areaCode = t.areaCode;
				number = t.number;
				extension = t.extension;
				PhysicalType = t.PhysicalType;
			}
			
			/**
			 * Mutator method of the country code
			 * @param countryCode
			 */
			public void setCountryCode(String countryCode) {
				this.countryCode = countryCode;
			}
			
			/**
			 * Accessor method of the country code
			 * @return contry code
			 */
			public String getCountryCode() {
				return countryCode;
			}
			
			/**
			 * Mutator method of the nationalDirectDialingPrefix
			 * @param NDD
			 */
			public void setNDD(String NDD) {
				this.NDD = NDD;
			}
			
			/**
			 * Accessor method of the nationalDirectDialingPrefix
			 * @return nationalDirectDialingPrefix
			 */
			public String getNDD() {
				return NDD;
			}
			
			/**
			 * Mutator method of the area code
			 * @param areaCode
			 */
			public void setAreaCode(int areaCode) {
				this.areaCode = areaCode;
			}
			
			/**
			 * Accessor method of the area code
			 * @return
			 */
			public int getAreaCode() {
				return areaCode;
			}
			
			/**
			 * Mutator method of the number
			 * @param number
			 */
			public void setNumber(long number) {
				this.number = number;
			}
			
			/**
			 * Accessor method of the number
			 * @return number
			 */
			public long getNumber() {
				return number;
			}
			
			/**
			 * Mutator method of the extension
			 * @param extension
			 */
			public void setExtension(int extension) {
				this.extension = extension;
			}
			
			/**
			 * Accessor method of the extension
			 * @return extension
			 */
			public int getExtension() {
				return extension;
			}
			
			/**
			 * Mutator method of the physical type
			 * @param PhysicalType
			 */
			public void setPhysicalType(String PhysicalType) {
				this.PhysicalType = PhysicalType;
			}
			
			/**
			 * Accessor method of the physical type
			 * @return physical type
			 */
			public String getPhysicalType() {
				return PhysicalType;
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
				TelecomAddress t = (TelecomAddress)x;
				return (this.countryCode == t.countryCode && this.getValidFrom() == t.getValidFrom() && this.getValidTo() == t.getValidTo() && this.NDD == t.NDD && this.areaCode == t.areaCode && this.number == t.number && this.extension == t.extension && this.PhysicalType == t.PhysicalType);
				}
			}
			
			/**
			 * toString method to return a string containing the informations of the TelecomAddress class
			 */
			public String toString() {
				return "the Telecom adress given is "+countryCode+" "+"("+NDD+")"+" "+areaCode+" "+number+" ext. "+extension+" "+PhysicalType +"and it is valid from "+getValidFrom() + " to "+getValidTo();
			}
}
