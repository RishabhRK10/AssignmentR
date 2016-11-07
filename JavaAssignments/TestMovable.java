import java.util.Scanner;

interface Move{
	 void Up(); 
	 void Down();
	 void Left();
	 void Right(); 
}
class MovePoint implements Move{
	 int x;
	 int y;
	 MovePoint(int x,int y){
		 this.x=x;
		 this.y=y;
	 }
	 public void Up(){
		 y++;
	 }
	 public void Down(){
		 y--;
	 }
	 public void Left(){
		 x--;
	 }
	 public void Right(){
		 x++;
	 }
}
public class TestMove {
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the x coordinates of the point:");
		int x=a.nextInt();
		System.out.println("Enter the y coordinates of the point:");
		int y=a.nextInt();
		MovePoint m1=new MovePoint(x,y);
		m1.Up();
		System.out.println("New up point ("+m.x+","+m.y+")");
		m1.Down();
		System.out.println("New down point ("+m.x+","+m.y+")");
		m1.Right();
		System.out.println("New right point ("+m.x+","+m.y+")");
		m1.Left();
		System.out.println("New left point ("+m.x+","+m.y+")");
		a.close();
	}
}
