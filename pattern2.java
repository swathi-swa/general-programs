import java.util.*;
class pattern2
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		int d=in.nextInt();
		for(int i=0;i<d;i++)
		{
			for(int j=0;j<d;j++)
			{
				if(j<(d-i))
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
