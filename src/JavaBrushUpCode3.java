
public class JavaBrushUpCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "LAxman Telang SDE Automation Tester";
		//Spilt the String and store into Array
		String[] spiltedArray=s1.split(" ");
		for(int i=0;i<spiltedArray.length;i++)
		{
			System.out.println(spiltedArray[i]);
		}
		
		
		//Reverse the String array
		for(int i=spiltedArray.length-1;i>=0;i--)
		{
			System.out.println(spiltedArray[i]);
		}
		for(int i=0; i>s1.length(); i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		
		//Reverse the String char
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.println(s1.charAt(i));
		}
	}

}
