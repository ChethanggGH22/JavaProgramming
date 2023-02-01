package Numbers;
//to fetch single digit divide by 10
//to fetch double digit divide by 100
//to fetch three digit divide by 1000
public class StoreNumInArrayAdvance 
{
	public static void main(String[] args) 
	{
		int no=1242;
		int[] arr=new int[counting(no)];
		int index=arr.length-1;
		while(no!=0)
		{
			arr[index]=no%10;
			index--;
			no=no/10; 
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	static int counting(int no)
	{
		int count=0;
		while(no!=0)
		{
			count++;
			no=no/10;
		}
		return count;
	}
}
