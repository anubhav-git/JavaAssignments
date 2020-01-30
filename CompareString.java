import java.util.Scanner;

public class CompareString
{
	int l1,l2;
	public int compareStr(String s1, String s2)
	{
		l1 = s1.length();
		l2 = s2.length();
		
		if(l1>l2)
		{
			String temp = s1;
			s1 = s2;
			s2 = temp;			
		}
		
		for(int i=0; i<s1.length(); i++) 
		{
			int x = s1.charAt(i);
			
            if(x>=65 && x<=90) 
			{
                x+=32;
            }
			
            int y = s2.charAt(i);
			
            if(y>=65 && y<=90) 
			{
                y+=32;
            }
			
			if(x-y>0) 
			{
				return 1;
            }
			
			if(x-y<0) 
			{
				return -1;
			}
        }
		
        return 0;
	}
	
	public static void main(String args[])
	{
		CompareString cmp = new CompareString();
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter String1: ");
		String str = obj.nextLine();
		System.out.print("Enter String2: ");
		String str1 = obj.nextLine();
		
		int res = cmp.compareStr(str, str1);
		
		if(res==0)
		{
			if(cmp.l1>cmp.l2)
			{
				res = 1;
			}
			else if(cmp.l1<cmp.l2)
			{
				res = -1;
			}
		}
		
		System.out.println("\nResult of comparing two string is: "+res);
		
	}
	
}