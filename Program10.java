package guvihunter1;
import java.util.*;
public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		for(int k=0;k<n;k++)
		{
			if(arr[i]+arr[j]==arr[k] && (i<j)&&(j<k)&&(i<k))
			{
				System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
			}
		}
	}
}
	}

}
