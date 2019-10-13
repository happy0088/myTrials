
public class merge2sortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= new int []{-4,-5,1,3,6,8};
		int b[]=new int []{-5,-2,1,3,3,7};
		//int i=0,j=0,k=0;
		//int res[]=new int[arr1.length+arr2.length];
		//
		int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;
	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])
	        {
	            answer[k] = a[i];
	            i++;
	        }
	        else
	        {
	            answer[k] = b[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < a.length)
	    {
	        answer[k] = a[i];
	        i++;
	        k++;
	    }

	    while (j < b.length)
	    {
	        answer[k] = b[j];
	        j++;
	        k++;
	    }


		//
		
	for(int z=0;z<answer.length;z++)
	{
		System.out.print("\t"+answer[z]);
	}
	}

}
