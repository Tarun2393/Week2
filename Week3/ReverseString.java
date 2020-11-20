package Week3;
import java.util.*;

public class ReverseString {

	public static String reverseString() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a String: ");

		String str=obj.nextLine();
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		
		}
		return rev;
	}

	public static void main(String args[]) {
		ReverseString obj2= new ReverseString();
		System.out.println("The reverse of the String is : "  + reverseString());

	}
}
