import java.util.Scanner;
class object

{
	public static void main(String args[])
	
	{
		int i,num,n,flag = 0;
		Scanner object = new Scanner(System.in);
		n = object.nextInt();
		int arr[];
		arr = new int[n];
		for( i =0;i<n;i++)
		{
			arr[i] = object.nextInt();
		}
		num = object.nextInt();
		
		for( i =0;i<n;i++)
		{
			if(arr[i] == num)
				flag =1;
		}
		if(flag == 1)
		{
			System.out.println("Available");
		}
		else 
			
		{
			System.out.println("Not Available");
		}
	}
}