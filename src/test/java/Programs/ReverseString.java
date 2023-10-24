package Programs;

public class ReverseString {

	public static void main(String[] args) {
		//declaring string
		String name="khaja";
		String rev="";
		for(int i=0;i<name.length();i++) {
			rev=name.charAt(i)+rev;
		
		}
		System.out.println(rev);

	}

}
