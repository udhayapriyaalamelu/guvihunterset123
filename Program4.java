package guvihunter1;
import java.util.*;
public class Program4 {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int freq[]=new int[n];
		int count=0;
		for(int i=0; i<n; i++)
		{
		    arr[i]=sc.nextInt();
		    freq[i] = -1;
		}


		for(int i=0; i<n; i++)
		{
		    count = 1;
		    for(int j=i+1; j<n; j++)
		    {
		        if(arr[i]==arr[j])
		        {
		            count++;
		            freq[j] = 0;
		        }
		    }
		    if(freq[i] != 0)
		    {
		        freq[i] = count;
		    }
		}
		for(int i=0;i<n;i++)
		{
		if(freq[i]==1)
		System.out.println(arr[i]);
		}

			}

		}

