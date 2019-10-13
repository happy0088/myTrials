
public class occurance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=23;
		int num2=1234542323;
		
		String s1= ((Integer)num1).toString();
		System.out.println(s1);
		String s2= ((Integer)num2).toString();
		System.out.println(s2);

		String str = "slkhellodjladhellofjhello";
		String findStr = "hello";
		str=s2;
		findStr=s1;
		int lastIndex = 0;
		int count =0;

		
		for(int x=0;x<10;x++)
		{
			System.out.print(x);
		}
		System.out.println("\n");
		for(int x=0;x<10;++x)
		{
			System.out.print(x);
		}
		
		while(lastIndex != -1){

		       lastIndex = str.indexOf(findStr,lastIndex);

		       if( lastIndex != -1){
		             count ++;
		             lastIndex+=findStr.length();
		      }
		}
		System.out.println(count);
	}

}
