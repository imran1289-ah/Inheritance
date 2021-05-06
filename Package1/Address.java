// -----------------------------------------------------
// Assigment 2 Part 1
// Written by: (Imran Ahmed 40172931)
// -----------------------------------------------------

package Package1;

public class Address {
	
			private String validFrom;
			private String validTo;
			
			/**
			 * The default constructor of the Address class. This constructor initializes the validFrom and validTo String to empty strings;
			 */
			public Address () {
				validFrom="";
				validTo="";
			}
			
			/**
			 * The parameterized constructor of the Address class. It takes two parameters String dates validFrom and validTo and assign them
			 * to the respective instance variables
			 * @param validFrom
			 * @param validTo
			 */
			public Address (String validFrom, String validTo) {
				this.validFrom = validFrom;
				this.validTo = validTo;
			}
			
			/**
			 * The copy constructor of the address class. It takes a parameter, a address class and create a copy of it
			 * @param a
			 */
			public Address (Address a) {
				validFrom = a.validTo;
				validTo = a.validTo;
			}
			
			/**
			 * Mutator method to set a validFrom date to the address class
			 * @param validFrom
			 */
			public void setValidFrom(String validFrom) {
				this.validFrom = validFrom;
			}
			
			/**
			 * Accesor method which get the validFrom date of the address class
			 * @return validFrom date
			 */
			public String getValidFrom() {
				return validFrom;
			}
			
			/**
			 * Mutator method to set a validTo date to the address class
			 * @param validTo
			 */
			public void setValidTo(String validTo) {
				this.validTo = validTo;
			}
			
			/**
			 * Accesor method which gets the validTo date of the address class
			 * @return validTo date
			 */
			public String getValidTo() {
				return validTo;
			}
			
			/**
			 * equals method which takes a parameter which is any object and attempts to check if they are equal
			 * @param Object
			 */
			public boolean equals(Object x) {
				if (x == null || this.getClass() != x.getClass()) {
					return false;
				}
				else
				{
					Address a = (Address)x;
					return (this.getValidFrom() == a.getValidFrom() && this.getValidTo() == a.getValidTo());
				}
			}
			
			/**
			 * toString method to return a string containing the informations of the address class
			 */
			public String toString() {
				return "This address is valid from "+validFrom+" to "+validTo;
			}
			
			

}
