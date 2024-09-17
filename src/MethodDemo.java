
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo d=new MethodDemo();
			d.getData();
			
			String name =d.getDataString();
			System.out.println(name);
			MethodDemo1 d2=new MethodDemo1();
			d2.userInfo();
			userAge();
			
	}

	public void getData() {
		
		System.out.println("LAXMAN TELANG");
	}
	public String getDataString() {
		
		//System.out.println("LAXMAN TELANG");
		return("Software Tester");
	}
	public static void userAge()
	{
		System.out.println("Age is 32");
	}
	
}
