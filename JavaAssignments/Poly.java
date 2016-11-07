package kumar;

 interface Partone {
	 void run();  
 } 
	public class Poly implements Partone{  
	  public void run(){
		  System.out.println("Test run successfully");}  
	  
	  public static void main(String args[]){  
	    Partone b = new Poly(); 
	    b.run();  
	  }  
}
