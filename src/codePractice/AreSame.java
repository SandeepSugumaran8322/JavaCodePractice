package codePractice;

import java.util.Arrays;
import java.util.HashMap;
public class AreSame {
	public static boolean comp(int[] a, int[] b) 
	  {
	    System.out.println(Arrays.toString(a));
	    System.out.println(Arrays.toString(b));
	    int inc=1,temp;
	    String abc="abc";
	    System.out.println(abc.charAt(0)-abc.charAt(0));
	    boolean flag=false;
	    HashMap<Integer,Integer> map=new HashMap<>();
	    if((a.length==b.length)&&(a!=null&&b!=null)&&a.length!=0||b.length!=0)
	    {
	      for(int i=0;i<b.length;i++)
	      {     
	        if(!map.containsKey(b[i]))
	        {
	          map.put(b[i],inc);
	        }
	        else
	        {
	          inc=map.get(b[i]);
	          inc++;
	          map.replace(b[i],inc);
	        }
	       }
	       for(int i=0;i<a.length;i++)
	       {
	        temp=a[i]*a[i];
	         if(map.containsKey(temp)&&map.get(temp)!=0)
	         {
	           inc=map.get(temp);
	           inc--;
	           map.replace(temp,inc);
	           flag=true; 
	         }
	         else
	         {
	           flag=false;
	           break;
	         }
	       }
	      return flag;
	    }
	    else 
	    {
	      if(a.length==0&&b.length==0)
	      {
	    	  return true;
	      }
	      else
	      {
	    	  return false;
	      }
	  
	    	}
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{};
		int[] b = new int[]{};
		System.out.println(comp(a,b));

	}

}
