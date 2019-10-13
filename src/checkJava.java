import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


//public class checkJava {

	 interface DeclareStuff {
public static final int EASY = 3;
void doStuff(int t); }
 public class checkJava  {
	 
	 
	/* enum Elemenet
	 {
		earth,wind,
		fire{public String infor(){return "value";}
	 };
	 
 public String infor(){
 return "value";
 }
	 }*/
	 
	
	//Class.forname() 
	 /*
	 Float pi=new Float(3.1314f);
	 if(pi>3)
	 {
		 System.out.println("hj");
	 }*/
	 
 @SuppressWarnings("unchecked")
public static void main(String [] args) {
 int x = 5;
 //new checkJava().doStuff(++x);
 

 List arr= new ArrayList();
 arr.add(323);
 arr.add(433);
 arr.set(1,3);
 
 arr=Collections.unmodifiableList(arr);
 System.out.println(arr.size());
 arr.set(1,11);
 //System.out.println(arr.c);
 //System.out.println(arr.get(1));
 Iterator itr = arr.iterator();
 while(itr.hasNext())
 {
	 System.out.println(itr.next());
 }
 //arr.su
 
 
 }
 
 public static int doo()
 {
	return 0;
	 
 }
 

 }
 /*
 void doStuff(int s) {

//TestInside Help You Pass Any IT Exam http://www.TestInside.com
 s += EASY + ++s;
 System.out.println("s " + s);
 }
 }
 */
 
 class sub extends checkJava
 {
	 public static void doo()
	 {
		 
	 }
 }