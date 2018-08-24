package guvihunter1;
import java.util.*;
public class Program7 {

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
		if(arr[i]%2!=0 && i%2==0)
			System.out.println(" "+arr[i]);
	
		else if(arr[i]%2==0 && i%2!=0)
				System.out.println(" "+arr[i]);
		else
			continue;
}
	}

}
