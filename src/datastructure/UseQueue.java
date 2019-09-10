package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<String> employees = new LinkedList<String>();
		employees.add("Bibek Singh");
		employees.add("Alka Grandon");
		employees.add("Nayana Giri ");
		employees.add("Suresh Bharati");
		employees.remove();
		employees.peek();
		employees.poll();

		Iterator it = employees.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		for (String emplist : employees) {
			System.out.println(emplist);

		}

	}
}
