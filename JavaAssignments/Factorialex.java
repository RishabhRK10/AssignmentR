import java.util.Scanner;


public class Factorialex {
	 public static void main(String args[]){  
		 Scanner input = new Scanner (System.in);
		   System.out.print("enter numb: ");
		   int numb = input.nextInt();
		  int i,fact=1;  
		  int number=numb;  
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 } 
}
