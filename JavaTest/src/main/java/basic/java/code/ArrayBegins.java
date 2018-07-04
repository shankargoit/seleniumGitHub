package basic.java.code;

public class ArrayBegins 
{

	
	/*1.An array is a type of data structure 

	2.all elements must be of the same data type. 

	3.Once defined, the size of an array is fixed and cannot increase to accommodate more elements.

	4.The first element of an array starts with index zero.*/
	
	
	public static void main(String[] args) 
	{
		int arr[]=new int[10];
		
		int count;
		
		for(count=0;count<10;count++)
		{
			System.out.println("before"+count);

			arr[count]=count++;
			
			System.out.println("after"+count);
		}
		
		arr[11]=5;
		System.out.println(arr[8]);
		
	}
}
