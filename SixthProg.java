//Panagram
public class SixthProg {

	public static void main(String[] args) {
	
		String str1="abcdefghijklmnopqrstuvwxyz";
		str1=str1.toLowerCase();
		int count=0,index=0;
		int[] a=new int[26];
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
			{
				index=str1.charAt(i)-'a';
				
			}
			a[index]=1;
		}
		for(int j=0;j<a.length;j++)
		{
			if(a[j]==0)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("it is not a pangram");
		}
		else
		{
			System.out.println("it is a pangram");
		}
	}

}
