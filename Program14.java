package guvi;
import java.util.*;
public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int n=str.length();
Program14 pg=new Program14();
pg.permute(str,0,n-1);

}

	private void permute(String str, int l, int r) {
		if(l==r)
			System.out.println(str);
		else
			for(int i=l;i<=r;i++)
			{
				str=swap(str,l,i);
				permute(str,l+1,r);
				str=swap(str,l,i);
			}
		
	}

	private String swap(String a, int i, int j) {
		// TODO Auto-generated method stub
		char temp;
		char ch[]=a.toCharArray();
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return String.valueOf(ch);
	}

}
