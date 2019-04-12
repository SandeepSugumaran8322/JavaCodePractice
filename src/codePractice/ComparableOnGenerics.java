package codePractice;


class MyData<T extends Comparable<T>> implements Comparable<T>{
	private T value;
	
	public MyData(T value)
	{
		this.value=value;
	}
	public T getValue()
	{
		return value;
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		System.out.println("O: "+ o+" Value:"+getValue());
		return o.compareTo(getValue());
	}
	
	
}

public class ComparableOnGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyData<Integer> data=new MyData<Integer>(1);
		System.out.println(data.compareTo(2));
		MyData<Integer> data2=new MyData<Integer>(12);
		System.out.println(data2.compareTo(11));
	}

}
