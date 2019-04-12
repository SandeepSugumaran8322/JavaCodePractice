package codePractice;

public class MiddlePattern {
	 void printPattern(String str)
	{
		int retaini=0,len=str.length(),limit=len+(len-1);
		String letter="";
		StringBuilder retword=new StringBuilder(str.substring(len/2));
		retword.append(str.substring(0,len/2));
		for(int j=0;j<len;j++)
		{
			
			for(int i=retaini;i<limit-1;i++)
			{
				System.out.print(" ");
			}
			retaini=retaini+2;
			letter+=retword.charAt(j);
			System.out.println(letter);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern("RAT");

	}

}
