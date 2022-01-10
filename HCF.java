import java.util.*;
public class HCF {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.print("HCF Program");
		int n1=ob.nextInt();
		int n2=ob.nextInt();
		int re=0;
		while(n1>0 || n2>0 )
		{
		if(n1>n2)
		{
			 re=n1%n2;
					if(re==0)
					{
						System.out.print("HCF="+n2);
						break;
					}else
					{
						n1=n2;
						n2=re;
					}
		}else
		{
		 re=n2%n1;
		 if(re==0)
				{
					System.out.print("HCF="+n1);
					break;
				}else
				{
					n2=n1;
					n1=re;
				}

	}
		}
}
}