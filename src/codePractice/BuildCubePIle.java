package codePractice;
import java.util.Scanner;

public class BuildCubePIle {
		public static long findNb(long m) {
			long cubeSum=0,i=1;
				for(;cubeSum<m;i++) cubeSum+=i*i*i;
		    	return (cubeSum==m)? i-1: -1;
		    	
		    }
		
		public static void main(String srgs[]) {
			long m;
			Scanner sc=new Scanner(System.in);
			m=sc.nextLong();
			System.out.println(findNb(m));
			sc.close();
		}
}

