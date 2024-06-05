//Date : 5-6-24

//Convert Primitive data type as object use Wrapper Class

package wapperClassExample;
import java.util.*;

public class DemoWrapper {

	public static void main(String[] args) {
		
		int k = 32;
		String a = "ABC";
		
		
		Integer wrappedInt = Integer.valueOf(k);
		String wrappedString = String.valueOf(a);
		
		System.out.println("Wrapped Integer => " + k);
		System.out.println("Wrapped String => " + a);
		
		
	}

}
