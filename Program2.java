package guvi;
import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
System.out.println("enter the position to search:");
int pos=sc.nextInt();
int max=0;
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		if(arr[i]>arr[j])
			
		{
			max=arr[j];
			arr[j]=arr[i];
			arr[i]=max;
		}
	}
}
	System.out.println(arr[n-pos]);

	}

}
