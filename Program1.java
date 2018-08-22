package guvihunter1;
import java.util.*;
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
int str[]=new int[n];
int count=0;
for(int i=0;i<n-1;i++)
{
	for(int j=i+1;j<n-1;j++) {
	if(arr[i]==arr[j])
	{
		str[i]=arr[i];
		count++;break;
	}
	}
}
/*int[] num = new int[str.length()];

for (int i = 0; i < str.length(); i++){
    num[i] = str.charAt(i) - '0';
    }
Arrays.sort(str);
if(count>0)
	
	    System.out.print(" "+str);
else
	System.out.println("unique");*/
	int n;
	int v=0;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for(int j=0;j<n;j++)
	{
	for(int k=j+1;k<n;k++)
	{
	if(a[j]==a[k])
	{
	v=1;
	System.out.print(a[j]+" ");
	}
	}
	}
	if(v==0)
	{
	System.out.println("Unique");
	}
}

}
