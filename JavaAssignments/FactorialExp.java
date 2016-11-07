import java.util.Scanner;


public class FactorialExp {
   public static void main(String args[])
   {
	   Scanner input = new Scanner (System.in);
	   System.out.print("No. of rows: ");
	   int rows = input.nextInt();
	   for (int x = 1; x <=rows; x++)
       {
           for (int i = 1; i <= x; i++)
           {
               System.out.print("*");
           }
           System.out.println(" ");
       }
		
   }
   
        }
    