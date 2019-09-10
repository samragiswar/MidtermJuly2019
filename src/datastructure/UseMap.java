package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

			List<String> typesofColors = new ArrayList<String>();
			typesofColors.add("Red");
			typesofColors.add("Blue");
			typesofColors.add("Green");

			List<String> colors2 = new ArrayList<String>();
			colors2.add("Yellow");
			colors2.add("White");
			colors2.add("Pink");


			List<String> colors3 = new ArrayList<String>();
			colors3.add("Purple");
			colors3.add("Magenta");
			colors3.add("Black");

			Map<String, List<String>> typesofcolors = new HashMap<String, List<String>>();
			typesofcolors.put("Type of colors", typesofColors);
			typesofcolors.put("Types of colors two", colors2);
			typesofcolors.put("Types of colors three", colors3);

			Iterator it = typesofcolors.entrySet().iterator();

			while (it.hasNext()) {
				System.out.println(it.next());
			}

			for (Map.Entry<String, List<String>> colorType : typesofcolors.entrySet()) {
				System.out.println("Different types of colors :" + colorType.getKey() + "--->" + colorType.getValue());
			}

		}
	}