package guvihunter1;
import java.util.*;
public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String s1[]=str.split(" ");
String word="";
StringBuffer stbuild=new StringBuffer(str);
for(int i=0;i<s1.length;i++)
{
    char ch[]=s1[i].toCharArray();
    for(int j=ch.length-1;j>=0;j--)
    {
    	word=word+ch[j];
    }
}
System.out.println(word+" ");
	}

}
