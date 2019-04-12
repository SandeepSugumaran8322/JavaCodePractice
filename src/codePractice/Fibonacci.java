package codePractice;
import java.util.HashMap;
public class Fibonacci {
	
	public static void main(String[] args) {
		HashMap<Long,Long> look=new HashMap<Long,Long>();
		look.put((long)0,(long)1);
		look.put((long)1,(long)1);
		look.put((long)2,(long)1);
		System.out.println(fib(4,look));
	}
	 public static long fib(long val,HashMap<Long,Long> table)
	   {
		 long result;
	      if(!table.containsKey(val))
	      {
	      result=fib(val-1,table)+fib(val-2,table);
	      table.put(val,result);
	      }
	      else
	      {
	        result=table.get(val);
	      }
	      return result;
	   }
}
