package collection;

import java.util.ArrayList;

public class Arraylist 
{
public static void main(String[] args)
{
	int a[]= {10,20,30};
	for(int i=0;i<=2;i++)
	{
		System.out.println(a[i]);
	}
	
ArrayList b =new ArrayList();

b.add(100);
b.add(200);
b.add(300);
b.add("shreyash");
System.out.println(b);
//System.out.println(b.get(3));
//ArrayList <Integer> c=new ArrayList<Integer>();
//c.add(100);
//System.out.println(c);

	b.set(3, 111);
	System.out.println(b.get(3));
	System.out.println(b);
	b.remove(3);
	System.out.println(b );
int s=	b.size();
System.out.println(s);
	
}
}