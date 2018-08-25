package guvi;
import java.util.*;
public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<n;i++)
{
	sum+=arr[i];
}
System.out.println(sum);
	}

}
