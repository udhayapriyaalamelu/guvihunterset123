package guvihunter1;
import java.util.*;
public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int str=sc.nextInt();
String b=String.valueOf(str);
char c[]=b.toCharArray();
String dd="";
int count=0;
char v='A';
HashMap<Integer,Character> pp=new HashMap<Integer,Character>();
for(int i=1;i<26;i++)
{
	pp.put(i,v);
	v++;
}
for(int i=0;i<c.length;i++)
{
int c1=Character.getNumericValue(c[i]);
if(pp.containsKey(c1));
char k=pp.get(c1);
dd=dd+k;
count++;
}
System.out.println(dd);
System.out.println(count-2);
	}

}
