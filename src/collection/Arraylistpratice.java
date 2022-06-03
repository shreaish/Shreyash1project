package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Arraylistpratice
{
public static void main(String[] args) {
//	ArrayList a=new ArrayList();
//	//add
//	a.add("shreyash");
//	a.add(10);
//	a.add(20);
//	a.add(30);
//	//print all
//	System.out.println(a);
//	//printspacificvalue
//	
//	System.out.println(a.get(0));
//	//replace
//	a.set(0,"Deulkar");
//	System.out.println(a.get(0));
//	a.remove(0);
//	System.out.println(a);
//	int za=a.size();
//	System.out.println(za);
//	
//	ArrayList<String> c=new ArrayList<String>();
//	c.add("shreyash");
	
	Set sa=new HashSet();
	sa.add(100);
	sa.add(23);
	sa.add("shreyahs");
	sa.add(90);
	
	System.out.println(sa);
Iterator it=	sa.iterator();
//
for(int i=1;i<4;i++)
{
	System.out.print ( it.next());
}
	
}
}
