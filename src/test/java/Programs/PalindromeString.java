package Programs;

public class PalindromeString {
	public static void main(String[] args) {
		String name="khaja";
		String rev="";
		for(int i=0;i<name.length();i++) {
			rev=name.charAt(i)+rev;
		
		}
		System.out.println(rev);
		if(rev.equals(name))
		{
			System.out.println("the string is palindrome");
		}
		else
		{
			System.out.println("the string is not palindrome");
		}

	}

	

}
