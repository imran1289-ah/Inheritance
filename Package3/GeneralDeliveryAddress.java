// -----------------------------------------------------
// Assigment 2 Part 1
// Written by: (Imran Ahmed 40172931)
// -----------------------------------------------------

package Package3;
import Package1.Address;
import Package2.TelecomAddress;



public class GeneralDeliveryAddress extends TelecomAddress {
			
			private String addressLine;
			private String city;
			private String regionOrState;
			private String zipOrpostcode;
	
	
			/**
			 * Defualt constructor of the general delivery address. Initalizes all instances varaibles to empty strings
			 */
			public GeneralDeliveryAddress() {
				addressLine="";
				city ="";
				regionOrState="";
				zipOrpostcode="";
			}
			
			/**
			 * Parameterized constructor of the general delivery address. 
			 * @param validF
			 * @param validT
			 * @param countryCode
			 * @param NDD
			 * @param areaCode
			 * @param number
			 * @param extension
			 * @param PhysicalType
			 * @param addressLine
			 * @param city
			 * @param regionOrState
			 * @param zipOrpostcode
			 */
			public GeneralDeliveryAddress(String validF, String validT, String countryCode, String NDD , int areaCode, long number, int extension, String PhysicalType, String addressLine , String city, String regionOrState , String zipOrpostcode) {
				super (validF, validT, countryCode, NDD , areaCode, number, extension,PhysicalType);
				this.addressLine = addressLine;
				this.city = city;
				this.regionOrState = regionOrState;
				this.zipOrpostcode = zipOrpostcode;
			}
			
			/**
			 * Copy constructor of the general delivery address
			 * @param a address
			 * @param g general delivery address
			 */
			public GeneralDeliveryAddress(Address a , GeneralDeliveryAddress g) {
				super (a,g);
				addressLine = g.addressLine;
				city = g.city;
				regionOrState = g.regionOrState;
				zipOrpostcode = g.zipOrpostcode;
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
			 * Accesor method of the city 
			 * @return
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
			 * Mutator method of the zip or post code
			 * @param zipOrpostcode
			 */
			public void setZipOrPostcode(String zipOrpostcode) {
				this.zipOrpostcode =zipOrpostcode;
			}
			
			/**
			 * Accessor method of the zip or post code 
			 * @return zip or post code
			 */
			public String getZipOrPostcode() {
				return zipOrpostcode;
			}
			
			/**
			 * equals method which takes a parameter which is any object and attempts to check if they are equal
			 * @param Object
			 */
			public boolean equals(Object x) {
				if (x == null || this == null || this.getClass() != x.getClass()) {
					return false;
				}
				else {
					GeneralDeliveryAddress g = (GeneralDeliveryAddress)x;
					return (this.getValidFrom() == g.getValidFrom() && this.getValidTo() == g.getValidTo() && this.addressLine == g.addressLine && this.city == g.city && this.zipOrpostcode == g.zipOrpostcode && this.getCountryCode() == g.getCountryCode() && this.getNDD() == g.getNDD() && this.getAreaCode() == g.getAreaCode() && this.getNumber() == g.getNumber() && this.getExtension() == g.getExtension() && this.getPhysicalType() == g.getPhysicalType());
				}
			}
			
			/**
			 * toString method to return a string containing the informations of the general delivery address class
			 */
			public String toString() {
				return  "The General delivery address given is "+addressLine+" "+city+" "+regionOrState+" "+zipOrpostcode+" "+",the Telecom address of the general delivery address is "+countryCode+" "+"("+NDD+")"+" "+areaCode+" "+number+" ext. "+extension+" "+PhysicalType +"and it is valid from "+getValidFrom() + " to "+getValidTo();
			}

}
