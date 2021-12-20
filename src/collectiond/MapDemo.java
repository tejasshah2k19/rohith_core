package collectiond;

import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
//		HashMap<String, String> hm = new HashMap<>();//TreeMap 
		TreeMap<String, String> hm = new TreeMap<>();
		hm.put("name", "rohith");
		hm.put("email", "r@gmail.com");
		System.out.println(hm);
		System.out.println(hm.get("name"));
		System.out.println(hm.get("email")); 
		System.out.println(hm.get("age"));//if key is not present then we got null value 
		hm.put("name", "ROHITH");
		System.out.println("hm => "+hm);

//		hm.remove("name");
		System.out.println(hm.size());// 2 
		System.out.println(hm.keySet());
		
//500 products 
		
		
		//300 tv
		//100 phone 
		//100 ac 
		
		
		//map.put("tv",listTv); //listTv --> is an array list contains objects of TV class 
		//map.put("phone",listPhone); //
		//s.o.p(map.get("tv"));
		
		
	}

}
