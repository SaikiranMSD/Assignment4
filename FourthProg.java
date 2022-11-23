//Wap to count consonents,vowels,specialcharacters
public class FourthProg {

	public static void main(String[] args) {
		String str="SAIkiran123@#";
		str=str.toLowerCase();
		System.out.println(str);
		String str2="";
		int consonentCount=0;
		int vowelCount=0;
		int specialCount=0;
		int numberCount=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' )
			{
				vowelCount++;
				
			}
			else if(Character.isLetter(c))
			{
				consonentCount++;
			}
			else if(Character.isDigit(c))
			{
				numberCount++;
			}
			else
			{
				specialCount++;
			}

			
			
			
			
		}
		System.out.println("Vowel count      ="+vowelCount);
		System.out.println("Consonent count  ="+consonentCount);
		System.out.println("Number count     ="+numberCount);
		System.out.println("Special count    ="+specialCount);
	
	}

}
