package codePractice;

public class AreSameOptimal {
	static int i;
	public static String order(String words)
	{
		int index=0,start=0,pivot=0;
		String organizedArray[]=words.split("\\s");
		if(words=="") return "";
		for(i=0;i<words.length();)
		{
			if(words.charAt(i)!=' '&&Character.isDigit(words.charAt(i)))
			{
				index=(int)words.charAt(i)-48;
				i++;
			}
			else if(words.charAt(i)==' '||i==words.length())
			{
				pivot=i;
				organizedArray[index-1]=words.substring(start,pivot);
				i=pivot+1;
				start=i;
			}
			else if(words.charAt(i)!=' ')
			{
				i++;
			}
			
		}
		pivot=i;
		organizedArray[index-1]=words.substring(start,pivot);
	return String.join(" ",organizedArray);
	}
	
	
	public static void main(String[] args) {
		String words="is2 Thi1s T4est 3a";
		System.out.println(order(words));
		

	}

}
