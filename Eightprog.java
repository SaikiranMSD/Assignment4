
public class Eightprog {

	public static void main(String[] args) {
		String s="aabbccccddeee";
		int index=0;
		int[] sa=new int[s.length()];
		int count=0;
		int maxCount=0;
		for(int i=0;i<s.length();i++)
		{
			char d=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				char e=s.charAt(j);
				if(d==e)
				{
					count++;
					
					
				}
			}
			sa[i]=count;
			count=0;
		}

		for(int j=0;j<s.length();j++)
		{
			if(maxCount<sa[j])
			{
				maxCount=sa[j];
				index=j;
			}
		}
		System.out.println(s.charAt(index));
		
	}

}
