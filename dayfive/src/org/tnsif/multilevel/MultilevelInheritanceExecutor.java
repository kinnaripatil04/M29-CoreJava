//program to demonstrate on Multilevel Inheritance
//driver class
package org.tnsif.multilevel;

public class MultilevelInheritanceExecutor {

	public static void main(String[] args) {
		City c = new City();
		c.setCityName("Pune");
		c.setArea("Viman Nagar");
		c.setStateName("Maharashtra");
		c.setLanguage("Marathi");
		c.setCountryName("India");
		c.setCountryCapital("Delhi");
		System.out.println(c);
	}

}
