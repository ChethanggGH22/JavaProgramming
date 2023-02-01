package Arrays;

public class PassArrayAsInput 
{
	public static void main(String[] args) 
	{
		int arr[]={2,3,4,2,4,5,54,24};
		disp(arr);
	}
	static void disp(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
/*if the method return tyoe is other than void then we can directly call the method in the print statement
 * class demo
 * {
 * 		static int disp()
 * 		{
 * 			return 10;
 * 		}
 * 		public static void main(String[] args)
 * 		{
 * 			System.out.println(disp());
 * 		}
 * }*/
