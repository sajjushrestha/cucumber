package testng;

import java.lang.reflect.Method;

public class DriverClass {

	
	
	
	public static Method method[];
	public static Keyword key;
	
	
	public void Driver() {
		
	 method=key.getClass().getMethods();
	
			 
	}
	
	
	
	public static void main(String args[])
	{
		System.out.println(method[1].getName());
	}
}
