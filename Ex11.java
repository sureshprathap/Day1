import java.util.*;
public class Ex11{
	public static void main(String[] args) {
		List<String> list_str = new ArrayList<String>();
		list_str.add("Red");
		list_str.add("Orange");
		list_str.add("Green");
		list_str.add("Blue");
		list_str.add("Yellow");
		System.out.println(list_str);
		
		list_str.add(0, "Pink");
		list_str.add(0, "Black");
		System.out.println(list_str);
	}
	
}