//Wap to print Duplicate charcters from the String
public class SecondProg {

	public static void main(String[] args) {
		String str="saikiran";
		int count=0;
		
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]);
					break;
					
				}
				
			}
			
			
		}
	

	}

}
