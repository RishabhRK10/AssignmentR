 class RishiK {
 void A() {
	System.out.print("This is a test");
}
 }
 class New1 extends RishiK{
	 void A() {
		 System.out.print("This is also a test");
	 }
	 
}

 class New{
	 public static void main(String args[]){
		 New1 N=new New1();
		 N.A();
	 }
 }
