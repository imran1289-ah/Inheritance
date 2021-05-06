// -----------------------------------------------------
// Assigment 2 Part 1
// Written by: (Imran Ahmed 40172931)
// -----------------------------------------------------

package Package3;

import Package1.Address;

public class PostOfficeBoxAddress extends GeographicAddress {
				
				private int boxLobbyDoorcode;
				
				/**
				 * Defualt constructor of the post office box address
				 */
				public PostOfficeBoxAddress() {
					int boxLobbyDoorcode = 0;
				}
				
				/**
				 * Parameterized constructor of the post office box address
				 * @param validF
				 * @param validT
				 * @param addressLine
				 * @param city
				 * @param regionOrState
				 * @param zipOrpostcode
				 * @param two_letter_cc
				 * @param num_cc
				 * @param Eng_lang_cn
				 * @param boxLobbyDoorcode
				 */
				public PostOfficeBoxAddress(String validF, String validT, String addressLine, String city, String regionOrState, String zipOrpostcode, String two_letter_cc , int num_cc , String Eng_lang_cn, int boxLobbyDoorcode) {
					super(validF,validT,addressLine,city,regionOrState,zipOrpostcode,two_letter_cc ,num_cc , Eng_lang_cn);
					this.boxLobbyDoorcode = boxLobbyDoorcode;
				}
				
				/**
				 * Copy constructor fo the post office box address
				 * @param a address
				 * @param p postofficeboxaddress
				 */
				public PostOfficeBoxAddress(Address a, PostOfficeBoxAddress p) {
					super(a,p);
					boxLobbyDoorcode = p.boxLobbyDoorcode;
				}
				
				/**
				 * Mutator method of the box lobby door code
				 * @param boxLobbyDoorcode
				 */
				public void setBoxLobbyDoorcode(int boxLobbyDoorcode) {
					this.boxLobbyDoorcode = boxLobbyDoorcode;
				}
				
				/**
				 * Accessor method of the box lobby door code
				 * @return box lobby door code
				 */
				public int getBoxLobbyDoorcode() {
					return boxLobbyDoorcode;
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
						
						PostOfficeBoxAddress p = (PostOfficeBoxAddress)x;
						return (this.getValidFrom() == p.getValidFrom() && this.getValidTo() == p.getValidTo() && this.getAddressLine() == p.getAddressLine() && this.getCity() == p.getCity() && this.getRegionOrState() == p.getRegionOrState() && this.getZipOrPostcode() == p.getZipOrPostcode() && this.boxLobbyDoorcode == p.boxLobbyDoorcode && this.getCC() == p.getCC() && this.getNumcc() == p.getNumcc() && this.getEn_lang() == p.getEn_lang());
					}
				}
				
				/**
				 * toString method to return a string containing the informations of the Post office box address class
				 */
				public String toString() {
					return "The Post Office Box address is "+this.getAddressLine()+" "+this.getCity()+" "+this.getRegionOrState()+" "+this.getZipOrPostcode()+" \""+locale.getCC()+"\" "+locale.getNumcc()+" \""+locale.getEn_lang()+"\" "+boxLobbyDoorcode+"and it is valid from "+this.getValidFrom() +" to "+this.getValidTo() +". ";
				}
				
				
	
			
			
			
			
			

}
