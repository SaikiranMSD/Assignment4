//Wap to check palindrome or not
public class ThirdProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="2552";
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
			char c=str1.charAt(i);
			str2= c+str2;
		}
		System.out.println(str1);
		System.out.println(str2);
		if(str1.equals(str2))
		{
			System.out.println("yes its a palindrome");
		}
		else
		{
			System.out.println("its not a palindrome");
		}
	}

}
