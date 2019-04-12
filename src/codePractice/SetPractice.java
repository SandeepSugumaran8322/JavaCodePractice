package codePractice;
import java.util.TreeSet;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new TreeSet<Integer>();
		for(int i=30;i>=0;--i)
		{
			set.add(i);
		}
		for(Integer elements:set)
		{
			System.out.println(elements);
		}
		
	}

}
