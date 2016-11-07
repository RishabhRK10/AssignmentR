import java.util.Scanner;


public class MathOP {
    static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);
    }
    static void sub(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a-b);
    }
    static void mult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a*b);
    }
    static void div(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(b!=0){
        System.out.println(a/b);
        }
        else{
            System.out.println("Division not possible");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice of operation:");
        int a=sc.nextInt();
        switch(a){
        case 1:
            add();
            break;
        case 2:
            sub();
            break;
        case 3:
            mult();
            break;
        case 4:
            div();
            break;
        default:
            System.out.println("Not a valid option");
        }
    }

}
