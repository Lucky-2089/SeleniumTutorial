
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;


import com.google.common.collect.Streams;

public class StreamsAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names=new ArrayList<String>();

		names.add("Abhi");
		names.add("Akshay");
		names.add("Ankush");
		names.add("Prashant");
		names.add("Shakti");
		names.add("Abhay");
		names.add("laxman");

		/* Below code is the old way of getting Result
for(int i=0;i<names.size();i++)
{
	String wantednames=names.get(i);
	if(wantednames.startsWith("A")) {
		count++;
	}

}*/
		//Using Stream in one line we get the output:
		long count = names.stream()
				.filter(s -> s.startsWith("A"))
				.count();
		System.out.println("The count of the name are : "+count);

		System.out.println("Print all the names in the list");
		names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		System.out.println("Print first result from the above result");
		names.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
		System.out.println("Print all the names end with y in the list");
		Stream.of("Abhiy","Akshay","Ankush","Abhay","laxman","Prashant").filter(s -> s.endsWith("y")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		System.out.println("Print all the names start with A and sort the list");

		List<String> names1=Arrays.asList("akasha","arathi","aparna","kirti","laxmi","prerna");
		names1.stream().filter(s -> s.startsWith("a")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));

		System.out.println("Combines two Stream");
		Stream<String> newstring=Streams.concat(names.stream(),names1.stream());
		//newstring.sorted().forEach(s->System.out.println(s));
		//Desired list has the element present or not using equalsIgnoreCase to check below code is used
		boolean flag=newstring.anyMatch(s->s.equalsIgnoreCase("Ankush"));
		Assert.assertTrue(flag);


		System.out.println(" Using Collector");
		List<String> collectors =Arrays.asList("akasha","arathi","aparna","kirti","laxmi","prerna");
		collectors.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(collectors.get(0));

		System.out.println("List of Integer");

		System.out.println("Unique numbers");
		List<Integer> numbers =Arrays.asList(1,3,2,3,4,6,7,5,4,9,8,3,2);
		numbers.stream().distinct().sorted().forEach(s->System.out.println(s));

		System.out.println("Unique numbers sorted and print inedx[2]");

		List<Integer> Index =Arrays.asList(1,3,2,3,4,6,7,5,4,9,8,3,2);
		List<Integer> Ind=Index.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(Ind.get(2));
		
		
		//Reverse the String
		String org =("Iam a software Tester");
		StringBuilder s=new StringBuilder(org);
		s.reverse();
		System.out.println(org);
		System.out.println(s);
	}


}
