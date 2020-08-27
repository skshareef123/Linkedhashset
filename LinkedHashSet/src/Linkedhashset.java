import java.util.*;

public class Linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet h=new LinkedHashSet();
		h.add("B");
		h.add("B");
		h.add("C");
		h.add("Z");
		h.add("null");
		h.add("10");
		System.out.println(h.add("Z"));
		System.out.println(h);


	}

}
