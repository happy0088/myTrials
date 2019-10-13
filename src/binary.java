import java.util.StringTokenizer;


public class binary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sNum="8.750";
		int place=sNum.indexOf(".");
		String st= sNum.substring(0, place);
		StringBuffer bValue=new StringBuffer();
		int iNum=Integer.parseInt(st);
		System.out.println(iNum);
		{
			while(iNum>0)
			{
				int x=iNum%2;
				bValue.append(x);
				iNum/=2;
			}
			bValue=bValue.reverse();
			System.out.println("before decimal "+bValue);
		}
		Double dNum=Double.parseDouble(sNum.substring(place));
		System.out.println(dNum);
		bValue.append(".");
		while(dNum>0)
		{
			int x=(int) (dNum *2);
			System.out.println();
			dNum *=2;
			dNum-=x;
			bValue.append(x);
		}
		System.out.println(bValue);
	}

}
