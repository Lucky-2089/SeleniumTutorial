
public class JavaBrushupCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum=54;
		String website="Test Academy";
		double percentage=65.56;
		boolean isTrue=true;
		char sex='M';
		
		int[] arr1=new int[5];
		arr1[0]=90;
		arr1[1]=91;
		arr1[2]=92;
		arr1[3]=93;
		arr1[4]=94;
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9};
			String[] name = {"Laxman","Rajesh","Ganesh","Vicky"};	
		System.out.println(myNum);
		System.out.println(website);
		System.out.println(percentage);
		System.out.println(sex);
		System.out.println(isTrue);
		//System.out.println("My array List"+arr1);
		
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		for(String l: name) {
			System.out.println(l);
		}
	}

}
