package collectiond;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTreeSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<>();

		hs.add(20);// true
		hs.add(-220);// t
		hs.add(1320);// t
		hs.add(120);
		hs.add(-20);
		hs.add(201);
		hs.add(202);
		hs.add(20);// false

		System.out.println(hs);
		hs.remove(20);// element
		System.out.println(hs);
		System.out.println(hs.size());

		System.out.println("----------------treeset---------------------");
		TreeSet<Integer> ts = new TreeSet<>();

		ts.add(20);// true
		ts.add(-220);// t
		ts.add(1320);// t
		ts.add(120);
		ts.add(-20);
		ts.add(201);
		ts.add(202);
		ts.add(20);// false

		System.out.println(ts);
		ts.remove(20);// element
		System.out.println(ts);
		System.out.println(ts.size());

		System.out.println("-------------------------------");

		
		System.out.println(ts.headSet(201));//exclusive
		System.out.println(ts.tailSet(201));//201 inclusive 
		System.out.println(ts.subSet(120, 250));
	
	
	
	
	}

}
