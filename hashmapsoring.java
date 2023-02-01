package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class hashmapsoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String > hashmap= new HashMap<Integer, String>();
		
		hashmap.put(1, "manoj");
		hashmap.put(4, "samanth");
		hashmap.put(5, "mounika");
		hashmap.put(2, "kiran");
		hashmap.put(5, "chandu");
		
		System.out.println("hasmap:"+hashmap);
		
		Set set = hashmap.entrySet();
		
		Iterator iterator = set.iterator();
		 while(iterator.hasNext()) {
			 Map.Entry pair =(Map.Entry)iterator.next();
			 System.out.println(pair.getKey()+"; ");
			 System.out.println(pair.getValue());
		 }
		Map<Integer, String> map= new TreeMap<Integer,String>();
		Set set2 = map.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry pair =(Map.Entry)iterator.next();
			System.out.println(pair.getKey());
			System.out.println(pair.getValue());
		}
	
	}

}
