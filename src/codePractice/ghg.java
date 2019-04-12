package codePractice;
import java.util.Arrays;

class ghg {
    
    public static long[] gap(int g, long m, long n) {
        long answer[]=new long[]{m,n};
        if(answer[0]==answer[1]) return answer;
        while(answer[0]+g!=answer[1]&&answer[1]<=n)
        {
            
         if(!isNotPrime(answer[0])&&!isNotPrime(answer[1])&&answer[1]==findNextPrime(answer[0]))
          {
        	 answer[0]=answer[1];
        	 answer[1]=findNextPrime(answer[0]);
        	 continue;
          }
         else if(!isNotPrime(answer[0]))
         {
           answer[1]=findNextPrime(answer[0]);
           continue;
         }  
         else
         {
           answer[0]=findNextPrime(answer[0]);
           answer[1]=findNextPrime(answer[0]);
           continue;
         }
        }
        if(answer[1]>n)
        {
          return null;
        }
        else
        {
          return answer;
        }
        
    }
    public static boolean isNotPrime(long val)
    {
    	if(val/2==0) return true;
    	boolean flag=false;
    	for(int i=3;i<=val/2;i=i+2)
        {
          if(val%i==0)
          {
            flag = true;
            break;
          }
        }
    	return flag;
    }
    
    public static long findNextPrime(long val)
    {
      boolean flag = true;
      while(flag)
      {
          val++;
          if(!isNotPrime(val))
          {
          break;
          }
          else
          {
            flag=true;
          }
      }
      return val;
   }
    public static void main(String args[])
    {
    	System.out.println(Arrays.toString(gap(2,1777,2777)));
    	System.out.println(Arrays.toString(gap(4,100,110)));
    	System.out.println(Arrays.toString(gap(8,300,400)));
    }
}