package kumar;


class Base{
	Base(){ System.out.println("case one");}
	Base(int a){System.out.println(a);}
}
 class Super extends Base{
	Super(){ System.out.println("case one");}
	Super(int a ){System.out.println(a);}
	public static void main(String args[]){
		Super S=new Super(); 
		Super S1=new Super(5); //constructor with parameter
	}

}
