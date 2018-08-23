package guvihunter1;
import java.util.*;
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,temp=0,k=0;
		int n=sc.nextInt();
		int arr[]=new int[n];
		int brr[]=new int[n];
		for(i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		    if(arr[i]==i)
		    {
		        brr[k++]=arr[i];
		    }
		}
		if(k==0)
		{
		    System.out.println("-1");
		}
		else
		{
		for(i=0;i<k;i++)
		{
		    for(j=i+1;j<k;j++)
		    {
		        if(brr[i]>brr[j])
		        {
		            temp=brr[j];
		            brr[j]=brr[i];
		            brr[i]=temp;
		        }
		    }System.out.println(" "+brr[i]);
		}
		}
	}
}
