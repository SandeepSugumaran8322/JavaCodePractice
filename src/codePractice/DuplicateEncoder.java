package codePractice;
import java.util.HashMap; 
import java.util.Scanner;
public class DuplicateEncoder {
	
		static String encode(String word)
	  {
	   StringBuilder string = new StringBuilder();
	   word=word.toLowerCase();
	   char[] wordArray=word.toCharArray();
	   System.out.println(wordArray);
	   HashMap<Character,Character> map=new HashMap<>();
	   for(int i=0;i<wordArray.length;i++)
	     {
	        if(map.containsKey(wordArray[i]))
	        {
	          if(!(map.get(wordArray[i])).equals(')'))
	          map.replace(wordArray[i],')');
	        }
	        else
	        {
	          map.put(wordArray[i],'(');
	        }
	      }
	      for(int i=0;i<wordArray.length;i++)
	        string.append(map.get(wordArray[i]));
	      return string.toString();
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		System.out.println(encode(word));
		System.out.println(21445%10);
		System.out.println(21445/10);
		sc.close();
		}
}
