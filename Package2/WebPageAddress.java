// -----------------------------------------------------
// Assigment 2 Part 1
// Written by: (Imran Ahmed 40172931)
// -----------------------------------------------------

package Package2;

import Package1.Address;

public class WebPageAddress extends Address {
			
			private String URL;
			
			/**
			 * the constructor of the WebPageAddress. It inherits from the address class and initializes the URL String to empty string
			 */
			public WebPageAddress() {
				URL = "";
			}
			
			/**
			 * the parameterized constructor of the WebPageAddress class. It takes as parameters the validFrom , ValidTo and URL strings
			 * and initializes them to their respective instance variables
			 * @param URL
			 * @param validF
			 * @param validT
			 */
			public WebPageAddress(String URL , String validF , String validT) {
				super(validF, validT);
				this.URL = URL;
			}
			
			/**
			 * The copy constructor of the WebPageAddress class. It takes a parameters a address class and a WebPageAddress class 
			 * @param w webpageaddress class
			 * @param a address class
			 */
			public WebPageAddress(WebPageAddress w , Address a) {
				super(a);
				URL = w.URL;
			}
			
			/**
			 * Mutator method to set the URL
			 * @param URL
			 */
			public void setURL(String URL) {
				this.URL = URL;
			}
			
			/**
			 * Accessor method to get the URL
			 * @return URL
			 */
			public String getURL() {
				return URL;
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
					WebPageAddress w = (WebPageAddress)x;
					return (this.URL == w.URL && this.getValidFrom() == w.getValidFrom() && this.getValidTo() == w.getValidTo());
				}
			}
			
			/**
			 * toString method to return a string containing the informations of the WebPageAddress class
			 */
			public String toString() {
				return "The URL of the given Web page is "+URL+" and it is valid from "+getValidFrom() + " to "+getValidTo();
			}
}
