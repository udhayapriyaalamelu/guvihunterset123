package guvihunter1;
import java.util.*;
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a1=sc.nextInt();
int b1=sc.nextInt();
int arr[]=new int[a1];
int brr[]=new int[b1];
for(int i=0;i<a1;i++)
	arr[i]=sc.nextInt();
for(int i=0;i<b1;i++)
	brr[i]=sc.nextInt();
boolean bool=false;
for(int i=0;i<a1;i++)
{
	for(int j=i;j<b1;j++)
	{
		if(brr[i]==arr[j])
		{
			bool=true;
			break;
		}
	}
}
if(bool)
	System.out.println("yes");
else
	System.out.println("no");
	}

}
