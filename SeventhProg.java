
public class SeventhProg {

	public static void main(String[] args) {
	
		String s="abcde";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char d=s.charAt(i);
			for(int j=i+1;j<s.length();j++)
			{
				char e=s.charAt(j);
				if(d==e)
				{
					count++;
					
				}
			}
		}
		if(count>0)
		System.out.println("it contain duplicates");
		else
			System.out.println("it contain all unique characters");

	}

}
