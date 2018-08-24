package guvihunter1;
import java.util.*;
public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
int temp=0,sum=0,temp2=0,j,count=0;
for(int i=0;i<n;i++)
{
	temp=arr[i];
	for(j=0;j<n;j++)
	{
		temp2=arr[j];
	sum=temp+temp2;
	if(sum==0)
	{
		System.out.println(arr[i]+" "+arr[j]);
		count++;
	}
	else
	{
		System.out.println("invalid");
	}
	}
		if(count==1)
			break;
}
	}

}
