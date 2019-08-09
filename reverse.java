import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner x = new Scanner(System.in);
		
		String str = x.next();
	    int len = str.length();
	    String rev="";
	    for(int i=len-1;i>=0;i--)
	    {
	        rev = rev + str.charAt(i) ;
	    }
	    System.out.print(rev);
	}
}
