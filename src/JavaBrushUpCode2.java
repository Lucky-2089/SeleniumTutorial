
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBrushUpCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for(int i=0;i<arr2.length;i++) 
		{
		if(arr2[i] % 2==0 )
		{
			System.out.println(arr2[i]);
			break;
		}
		else
		{
			System.out.println(arr2[i] + "is not multiple of 2");
			System.out.println("*****************");
		}
	}
//ArrayList
		ArrayList<String> a= new ArrayList<String>();
		a.add("Laxman");
		a.add("Telang");
		a.add("Software Tester");
		//a.remove(2);
		System.out.println(a.get(0));
		System.out.println("++++++++++++++++++++++++++");
		//Iterating the arrayList
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
			//Check the element in ArrayList 
			System.out.println(a.contains("Telang"));
			System.out.println("------------------------");
		}
		String[] arr3 = {"LAxman","Telang","SDE","Automation","Tester"};
		List<String> myNum= Arrays.asList(arr3);
		myNum.contains("Automation");
		System.out.println(myNum.get(3));
}
}