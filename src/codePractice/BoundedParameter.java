package codePractice;

 class DataTree<K extends Integer,V extends BoundedParameter>{
	private K key;
	private V value;
	public DataTree(K key,V value)
	{
		this.key=key;
		this.value=value;
	}
	public K getKey()
	{
		return key;
	}
	public V getValue()
	{
		return value;
	}
	@Override
	public String toString()
	{
		return "Element "+key+" Value :"+ value;
	}
	public <E,N> void  printElement(E element,N number)
	{
		System.out.println("Element :"+ element+" Number :"+number);
	}
}

public class BoundedParameter {

	public static void main(String[] args) {
		DataTree<Integer,BoundedParameter> data=new DataTree<Integer,BoundedParameter>(1,new BoundedParameter());
		data.getValue().print(data.getKey());
		DataTree<Integer,BoundedParameter> data2=new DataTree<Integer,BoundedParameter>(2,new BoundedParameter());
		data2.getValue().print(data2.getKey());
	}
	public void print(Integer objnum)
	{
		System.out.println("Testing Working fine! for "+objnum);
	}
}
