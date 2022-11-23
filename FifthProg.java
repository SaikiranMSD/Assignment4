import java.util.Arrays;

//Wap to check anagram or not


public class FifthProg {

	public static void main(String[] args) {
		String str1="caRe";
		String str2="rAce";
		int count=0;
		if(str1.length()==str2.length())
		{
			str1=str1.toLowerCase();
			str2=str2.toLowerCase();
			
			char[] a=str1.toCharArray();
			char[] b=str2.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			for(int i=0;i<a.length;i++)
			{
				if(!(a[i]==b[i]))
				{
					count++;
				}
				
			}
			if(count>0)
			{
				System.out.println("it is not an anagram");
				
			}
			else
				System.out.println("it is a anagaram");
		}
		else
		{
			System.out.println("it is not an anagram");
		}

	}

}
