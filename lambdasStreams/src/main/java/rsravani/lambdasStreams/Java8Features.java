package rsravani.lambdasStreams;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class Java8Features {
	public static double getavergae(List<Integer> nums)
	{
		return nums.stream()
		.mapToDouble(a->a)
		.average()
		.getAsDouble();
	}
	public static List<String> getstrings(List<String> words)
	{
		return words.stream().filter(val -> val.startsWith("a")).filter(val -> val.length()==3 ).collect(Collectors.toList());
	}
	
	public static List<String> filterlist(List<String> s, Predicate<String> predicate)
	{
		List<String> finallist=new ArrayList<>();
		for(String word: s)
		{
			if(predicate.test(word))
			{
				finallist.add(word);
			}
		}
		return finallist;
	}
	
	public static void main(String args[])
	{
		List<Integer> nums= Arrays.asList(1,2,2,5,101);
		System.out.println("Average of list nums is :"+getavergae(nums));
		
		
		List<String> words= Arrays.asList("a","abc","xyz","abcd","Abc","cad");
		System.out.println("Words starting with 'a' and having length 3 are :"+getstrings(words));
		
		List<String> s = Arrays.asList("a","aba","ABCD","DDDD","1234321");
		List<String> palindromes = Java8Features.filterlist(s, StringPredicate::ispalindrome);
		System.out.println("Palindromes are :"+palindromes);
		
	}
}









