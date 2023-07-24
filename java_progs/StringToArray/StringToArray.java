import java.util.*;
public class StringToArray
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please insert numbers separated by single space: ");
		String input = in.nextLine();
		input=input.trim();
		String[] numbers= input.split(" ");  //build string array using ' ' as delimiter between numbers
		int data[]= Arrays.asList(numbers).stream().mapToInt(Integer::parseInt).toArray();
		int l=data.length;
		for(int i=0; i<l; i++)
		{
			System.out.print(data[i]+" ");
		}
	}
}