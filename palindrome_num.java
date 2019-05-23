import java.util.*;
import java.lang.*;
import java.io.*;
class palin
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int count=0;
		int temp=s;
		while(s!=0)
		{			
			int rem=s%10;
			System.out.println(rem);
			count=count*10+rem;
			s=s/10;
			System.out.println(s);
		}
		if(temp==count)
			 System.out.println("PALINDROME ");
		else
			System.out.println(" NOT A PALINDROME ");
	}
}
  
