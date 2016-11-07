class Overload{
	void Init(int n,int a[]){
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
	void Init(int n,double a[]){
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
	void Init(int n,char a[]){
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}
public class Overloading {
	public static void main(String args[]){
		Overload o1=new Overload();
		
	     int arr1[]={1,2,3,4,5};
	     o1.Init(5, arr1);
	     double arr2[]={1,2,3,4,5};
	     o1.Init(5, arr2);
	     char arr3[]={'a','b','c','d','e'};
	     o1.Init(5, arr3);
	}
}
