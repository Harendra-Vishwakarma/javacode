package Sorting;
import java.util.Scanner;

class join_array
{
public static int[] jointwoarray(int[] a,int[] b)    //ai=2 5 7 9 10                              
{                                                    //b=j=1,3,6,8,11,13,14
 int[] join=new int[a.length+b.length];              //join=1,2,3,5,6,7,8,9,10,11,13,14
 int i=0,j=0,k=0;
 while(i<a.length && j<b.length)
{
    if(a[i]<a[j])
	{
 	join[k]=a[i];
        k++;
	i++;
	}else
	{
	join[k]=b[j];
	k++;
	j++;
	}
}

while(i<a.length)
	{
	join[k]=a[i];
	k++;
	i++;
	}
while(j<a.length)
	{
	join[k]=b[j];
	k++;
	j++;
	}
  return join;
}


public static void display(int[] re)
{
for(int i=0;i<re.length;i++)
      System.out.print(re[i]);
}


public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter size of the First array:");
int n=ob.nextInt();
System.out.println("Enter the first array Element:");
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=ob.nextInt();
}
System.out.println("Enter size of the second array:");
int n1=ob.nextInt();
int[] b=new int[n1];
System.out.println("Enter the second array Element:");
for(int i=0;i<n1; i++)
{
b[i]=ob.nextInt();
}

int[] result=jointwoarray(a,b);
display(result);
}
}