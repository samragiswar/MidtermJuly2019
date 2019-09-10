package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> arrray = new ArrayList<>();

		arrray.add(100);
		arrray.add(200);
		arrray.add(300);
		arrray.add(400);
		arrray.add(500);
		arrray.add(600);
		arrray.add(700);
		arrray.add(800);


		System.out.println("Peek element: " + arrray.get(0)); // The array peek element


		System.out.println("Remove element at index 6: " + arrray.remove(6));



		System.out.println("Re-retrieving elements: " + arrray);

			// retrieving data Using forEach loop
		System.out.print("Re-retrieving elements from ArrayList: ");
		for (Integer in : arrray) {
			System.out.print(" "+in);
		}
		System.out.println();
		System.out.print("Re-retrieving elements from ArrayList: ");
		Iterator it = arrray.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			System.out.print(" "+i);
		}

		System.out.println();

		//Sorting ArrayList
		Collections.sort(arrray);
		System.out.println(arrray);
		List list = new ArrayList();
		list = arrray;




	}

}
