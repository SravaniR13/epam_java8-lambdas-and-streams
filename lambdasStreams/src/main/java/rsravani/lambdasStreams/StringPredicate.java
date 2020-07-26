package rsravani.lambdasStreams;
public class StringPredicate {
	public static boolean ispalindrome(String s)
	{
		int l=0;
		int r=s.length()-1;
		while(l<r)
		{
			if(s.charAt(l)!=s.charAt(r))
			{
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}
