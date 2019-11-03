package testng;

import java.util.LinkedList;
import java.util.List;


public class TestClass {
	
	public static void main(String[] args) {
		
		
		
		/*Book galaxy = new Book(); 
		galaxy.setTitle("The Hitchhiker's Guide to the Galaxy");  
		Book wap = new Book();  
		wap.setTitle("War and Peace");  
		BookSwapper bookswapper= new BookSwapper();  
		bookswapper.swapTitle(galaxy, wap);  

System.out.println("galaxy title: " + galaxy.getTitle() + " wap title: " + wap.getTitle());
	}*/
		List<Integer> keys = new LinkedList<Integer>();
		Integer i=keys.get(0);
		int s=keys.get(0);
	  keys.add(new Integer(23));
	  int x = 42; int y = switcher(x);
	  
	  System.out.println("X = " + x + " Y = " + y); }
	  
	  public static int switcher (int x){ int y = 0;
	  
	  
	  switch( x ){
	  
	  case 4: y = 2; break; case 2: y = 4; break; default: y = 10;
	  
	  }
	  
	  return y; }
	  
	  
	  
	  
	 
	
		
}


