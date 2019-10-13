
public class kmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]={2,4,1,8,9,5,6,10,7,3};
		//int a[]={9,8,7};
		int k=5;
		int N=a.length;
		
		sort(a,k,N);
		
	}
	public static void sort(int[]a, int k , int N )
	{
		for(int i=0;i<(N-k+1);i++)
		{
			int min=a[i];
			for(int j=i;j<(i+k-1);j++)
			{
			if(min>a[j+1])
			{
			min=a[j+1];	
			}
			}
			
			System.out.print(min+"  ");
		}
	}

}
