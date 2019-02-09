class pattern4
{
public static void main(String[]args)
{
	int a=5;
	for(int i=a;i>0;i--)
	{
		for(int j=0;j<a;j++)
		{
			if(j<(a-i))
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("*");
			}
		}
	System.out.println("");
}
}
}
