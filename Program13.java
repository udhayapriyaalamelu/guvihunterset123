package guvi;
import java.util.*;
public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String s2=str;
String s1[]=str.split(" ");
String word="";
StringBuffer st=new StringBuffer();
for(int i=0;i<s1.length;i++)
{
	char ch[]=s1[i].toCharArray();
	for(int j=ch.length-1;j>=0;j--)
	{
		word=word+ch[j];
	}
}
if(word.equals(s2))
{
	System.out.println("yes");
}
else
System.out.println("no");

	}

}
