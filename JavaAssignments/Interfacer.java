package kumar;

 interface Interfacer1 {
	void print();  
	}  
	  
 public	class Interfacer implements Interfacer1{  
	public void print(){System.out.println("Hello");}  
	  
	public static void main(String args[]){  
		Interfacer M = new Interfacer();  
	M.print();  
	 }  
}
