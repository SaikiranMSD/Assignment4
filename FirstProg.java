//Wap to remove Duplicates from a String
public class FirstProg {

	public static void main(String[] args) {
		
		String str="saikiran";
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(!str2.contains(Character.toString(c)))
			{
				str2=str2+c;
			}
			
		}
		System.out.println(str2);

	}

}
