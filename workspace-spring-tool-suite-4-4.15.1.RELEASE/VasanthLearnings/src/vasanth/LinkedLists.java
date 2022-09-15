package vasanth;
import java.util.*;
public class LinkedLists {

	public static void main(String[] args) {
		List<String> m=new LinkedList<>();
		m.add("Vasanth");
		m.add("Abu");
		m.add("Jawa");
		m.add("Abdur");
		m.add("Sathya");
		System.out.println("\t\tLinkedList:");
	    m.forEach(System.out::println);
		System.out.println("\tReplaced LinkedList:");
		m.set(1, "Raj");
		m.forEach(i->System.out.println());
	}
}
