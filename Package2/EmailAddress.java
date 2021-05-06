// -----------------------------------------------------
// Assigment 2 Part 1
// Written by: (Imran Ahmed 40172931)
// -----------------------------------------------------

package Package2;

import Package1.Address;

public class EmailAddress extends Address {
				
				
				private String userName;
				private String at;
				private String domainName;
				private String dot;
				private String TLD;
				
				/**
				 * Default constructor of the EmailAddress class. It initializes the username, domainName to empty string. The rest is initalized to their definition
				 */
				public EmailAddress() {
					userName = "";
					at = "@";
					domainName = "";
					dot = ".";
					TLD = "com";
					
				}
				
				/**
				 * Parameterized constructor of the EmailAddress class. It takes as parameters the ValidFrom, Valid To and all instance variables
				 * of the EmailAddress class
				 * @param validF
				 * @param validT
				 * @param userName
				 * @param domainName
				 * @param TLD
				 */
				public EmailAddress(String validF , String validT , String userName , String domainName, String TLD ) {
					super(validF,validT);
					this.userName = userName;
					at = "@";
					this.domainName = domainName;
					dot = ".";
					this.TLD = TLD;
				}
				
				
				/**
				 * The copy constructor of the EmailAddress class. It takes as parameters an address class and the Emailaddress class
				 * @param e emailaddress class
				 * @param a address class
				 */
				public EmailAddress(EmailAddress e , Address a) {
					super(a);
					userName = e.userName;
					at = e.at;
					domainName = e.domainName;
					dot = e.dot;
					TLD = e.TLD;
				}
				
				/**
				 * Mutator method to set the userName 
				 * @param userName
				 */
				public void setUsername(String userName) {
					this.userName = userName;
				}
				
				/**
				 * Accessor method to get the userName
				 * @return username
				 */
				public String getUsername() {
					return userName;
				}
				
				/**
				 * Mutator method to set the domain name
				 * @param domainName
				 */
				public void setDomainname(String domainName) {
					this.domainName = domainName;
				}
				
				/**
				 * Accessor method to get the domain name
				 * @return domain name
				 */
				public String getDomainname() {
					return domainName;
				}
				
				/**
				 * Mutator method to set the Top Level Domain
				 * @param TLD 
				 */
				public void setTLD(String TLD) {
					TLD = this.TLD;
				}
				
				/**
				 * Accessor method to get the Top Level Domain
				 * @return Top level domain
				 */
				
				public String getTLD() {
					return TLD;
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
						EmailAddress e = (EmailAddress)x;
						return (this.userName == e.userName && this.getValidFrom() == e.getValidFrom() && this.getValidTo() == e.getValidTo() && this.domainName == e.domainName && this.TLD == e.TLD);
					}
					
				}
				
				/**
				 * toString method to return a string containing the informations of the EmailAddress class
				 */
				public String toString() {
					return "The email address given is "+userName+at+domainName+dot+TLD+" and "+" it is valid from "+getValidFrom() + " to "+getValidTo();
				}
				
				
				

}
