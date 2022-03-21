
import java.util.*;
public class partioning_array {
	
	public static void Findelementfromindex(int[] a,int lo,int hi,int ind) {
		if(lo>=hi)
		{
			return;
		}
		int in=partition(a,hi);
		if(in==ind-1)
		{
			System.out.println(a[in]+"is a element at index"+in);
		}else if(ind-1<in)
		{
			Findelementfromindex(a,lo,in-1, ind);
		}else
		{
			Findelementfromindex(a,in+1,hi, ind);
		}
	}
	public static int partition(int[] a,int n)
	{
		int pivot=a[n-1];
		int i=0,j=0;
		while(i<n)
		{
			if(a[i]>pivot)
			{
				i++;
			}else
			{
				swap(a,i,j);
				i++;
				j++;
			}
			
		}
		System.out.println("index of partion"+(j-1));
		return(j-1);
	}
	public static void swap(int[] a,int i,int j)
	{
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	
	
	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=ob.nextInt();
		int[] a=new int[n];
		System.out.print("Enter values array");
		for(int i=0;i<n;i++)
		{
			a[i]=ob.nextInt();
		}
		System.out.print("which index element you want to find, please enter:");
		int in=ob.nextInt();
		Findelementfromindex(a,0,n,in);
		for(int val:a)
		{
			System.out.print(val+"\t");
		}
	}

}
