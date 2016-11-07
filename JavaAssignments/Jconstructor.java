package kumar;

public class Constructor {
String s;
int i;
public Jconstructor(String s,int i){
	this.s = s;
	this.i = i;
}
public Constructor(boolean b) {

}
public String toString() {
	return "Test (s = " + this.s + ", i = " +  this.i + ")";
}
public static void main (String [] args) {
	Constructor a = new Constructor(true);
	Constructor b = new Constructor("string", 42);
	System.out.println("Test empty:" + a);
	System.out.println("Test full:"  + b);
}
}