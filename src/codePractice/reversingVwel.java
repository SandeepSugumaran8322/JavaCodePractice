package codePractice;
import java.util.*;


public class reversingVwel {
	/*package whatever //do not write package name here */
		public static void main (String[] args) {
			Scanner sin= new Scanner(System.in);
			int t= sin.nextInt();
			sin.nextLine();
			while(t-->0) {
			 String str=sin.nextLine();
			 process(str);
			}
		   sin.close();
		}
		public static void process(String string)
		{
		int i=0,j=string.length()-1;
		while(i<j)
		{
			if(isVowel(string.charAt(i))&&(isVowel(string.charAt(j))))
			{
				string=swap(string,i,j);
				i++;
				j--;
				
			}
			else if(!isVowel(string.charAt(i))&&(isVowel(string.charAt(j))))
				{
					i++;
					continue;
					
				}
			else if(isVowel(string.charAt(i))&&(!isVowel(string.charAt(j))))
				{
					j--;
					continue;
					
				}
			else
			{
				i++;
				j--;
			}
	}
		System.out.println(string);		
		}
		public static boolean isVowel(char val)
		{
			if(val=='a'||val=='e'||val=='i'||val=='o'||val=='u')
			{
				return true; 
			}
			else
				return false;
		}
		public static String swap(String string,int i,int j)
		
		{
			char temp;
			char[] strarray=string.toCharArray();
			temp=strarray[i];
			strarray[i]=strarray[j];
			strarray[j]=temp;
			return new String(strarray);
		}
		
	}

