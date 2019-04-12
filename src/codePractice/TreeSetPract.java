package codePractice;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.Set;

class DataTree{
	private Integer key;
	private String value;
	public DataTree(Integer key,String value)
	{
		this.key=key;
		this.value=value;
	}
	public Integer getKey()
	{
		return key;
	}
	public String getValue()
	{
		return value;
	}
	@Override
	public String toString()
	{
		return "Key "+key+"Value "+value;
	}
	
}
public class TreeSetPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<DataTree> compkey=new Comparator<DataTree>() {

			@Override
			public int compare(DataTree o1, DataTree o2) {
				if(o1.getKey()<o2.getKey())
				{
					return 1;
				}
				else if(o1.getKey()==o2.getKey())
				{
					return 0;
				}
				else
				{
					return -1;
				}
							
			}
			
		};
		Set<DataTree> set = new TreeSet<>(compkey);
		set.add(new DataTree(1,"sandeep"));
		set.add(new DataTree(2,"meiyyappan"));
		set.add(new DataTree(3,"ragavan"));
		set.add(new DataTree(4,"suthakar"));
		for(DataTree e:set)
		{
			System.out.println(e);
		}
		

	}

}
