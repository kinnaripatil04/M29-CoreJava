//program to demonstrate on filtering
package org.tnsif.streamapi;
import java.util.Arrays;
import java.util.List;
public class FilteringExample {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList("Ankita","Parag","Prathmesh","Ankita");
		obj.stream().filter((i->i.length()>5)).forEach((i)->
			System.out.print(i+" "));
		
		System.out.println();
		
		obj.stream().distinct().forEach((i)->
		System.out.print(i+" "));
		
		System.out.println();

		obj.stream().limit(2).forEach((i)->
		System.out.print(i+" "));
		
		System.out.println();

		obj.stream().skip(3).forEach((i)->
		System.out.print(i+" "));
		

	}

}
