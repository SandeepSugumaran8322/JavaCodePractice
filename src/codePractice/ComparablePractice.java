package codePractice;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

 class Names implements Comparable<Names>{
	private String name;
	private int age;
	public Names(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	@Override
	public int compareTo(Names obj)
	{
		if(age==obj.age)
		{
			return 0;
		}
		else if(age<obj.age)
		{
			return -1;
		}
		else 
		{
			return 1;
		}
	}
	@Override
	public String toString()
	{
		return "name "+this.name+" age "+this.age;
	}
}
public class ComparablePractice
{
	public static void main(String args[])
	{
		List list= new LinkedList<>();
		list.add(new Names("Sandeep",22));
		list.add(new Names("Saran",21));
		list.add(new Names("Ananya",3));
		ComparablePractice cp=new ComparablePractice();
		System.out.println("**********before*********");
		cp.print(list);
		Collections.sort(list);
		System.out.println("**********After*********");
		cp.print(list);
		
		
	}
	void print(List<Names> list)
	{
		ListIterator<Names> iterator=list.listIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
}