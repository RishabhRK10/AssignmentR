package kumar;

  class testFinal {
	 final int i=5;
	    final void mul(){System.out.println("The result is "+i*5);}
	}
	public class Prashant extends testFinal{
	    void mul(int x){System.out.println("The result is "+x*6);}
	 
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Prashant t=new Prashant();
	        t.mul();
	        t.mul(5);
	 

}
}