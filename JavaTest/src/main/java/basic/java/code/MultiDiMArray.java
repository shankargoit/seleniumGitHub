package basic.java.code;

public class MultiDiMArray 
{

	public static void main(String[] args) 
	{
		int row,col;
		//two D array
		
		/*//int arr[][] =new int[4][4];
		
		arr[0][0]=1;
		arr[0][1]=2;
		arr[1][0]=3;																				
		arr[1][1]=4;*/
		
		Object []obj=new Object[4];
		obj[1]= "shan";
		System.out.println(obj[1]);
	
        int[][] mul = new int[2][2];
        
        System.out.println(mul.length);
        
    

        for ( row = 0; row < mul.length; row++) {
            for ( col = 0; col < mul[row].length; col++) {
                mul[row][col] = row * col;
                System.out.print(mul[row][col] + "\t");
            }
            System.out.println();
	}
	
	}
	
}
