package guvihunter1;
import java.util.*;
public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
int count=0;
for(int i=0;i<n;i++)
{
if(arr[i]!=arr[i+1])
{
	count++;
}

if(count>0)
	System.out.println(arr[i]);
else
	System.out.println("-1");
}
	}

}
