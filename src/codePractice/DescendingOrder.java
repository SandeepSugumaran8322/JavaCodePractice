package codePractice;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
public class DescendingOrder {
	public static int sortDesc(final long num) {
		return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(sortDesc(num));
		sc.close();

	}

}
