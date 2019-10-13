

public class nthSmallest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]={2,4,1,8,9,5,6,10,7,3};
		
		bubble(a);
		
	}
	
	public static void bubble(int[] a)
	{
		int n=10;
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n-i-1;j++)
			{
				
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			//System.arraycopy(src, srcPos, dest, destPos, length)
			
	}
		
		for(int i=0;i<10;i++)
			System.out.print("   "+a[i]);		

	}
}
