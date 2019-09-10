package datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";
		FileReader fr = null;
		BufferedReader br = null;
		String ln;
		String st = "";

		try{
			fr = new FileReader(textFile);

		}catch(Exception e){
			System.out.println("File not found ");
		}

		try{
			br = new BufferedReader(fr);
			while((ln =br.readLine())!= null){
				System.out.println(ln);
				st+= ln;

			}
		}catch(Exception e){
			System.out.println("File not found ");
		}

		String[] stArray = st.split(" ");

		Stack<String> myStack = new Stack<String>();
		List<String> myList = new LinkedList<String>();
		for(String element : stArray){
			myStack.add(element);
			myStack.push(element);
		}
		System.out.println("LinkedList");
		Iterator<String> it = myList.iterator();
		while(it.hasNext()){
			System.out.println(it.next() + " ");
		}
		System.out.println("Stack");

		while(!myStack.isEmpty()){
			System.out.println(myStack.pop() + "  ");
		}



	}
}

