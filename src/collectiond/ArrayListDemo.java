package collectiond;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Vector === > Synchronized
		ArrayList<Integer> list = new ArrayList<>();// non-sync
		// unsorted ordered
		list.add(12);// 0
		list.add(12);// 1
		list.add(130);// 2
		list.add(1200);// 3
		list.add(130);
		list.add(13);

		System.out.println(list);

		System.out.println("------data-----------");
		for (Integer x : list) {
			System.out.println(x);
		}
		System.out.println("get(0) ==> " + list.get(0));

		System.out.println("size => " + list.size());

		list.remove(0); // 12 removed
		System.out.println(list);
		System.out.println("size => " + list.size());

		System.out.println("contains 130 => " + list.contains(130));

	}

}
