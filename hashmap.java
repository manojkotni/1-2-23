package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer ,String> hashmap= new HashMap<Integer ,String>();

			hashmap.put(1, "manoj");
			hashmap.put(2, "kiran");
			hashmap.put(3, "samanth");
			hashmap.put(4, "mounika");
			hashmap.put(5, "chandu");
			for (Map.Entry x: hashmap.entrySet()) {
				System.out.println(x.getKey()+" "+x.getValue());
			}
	}

}
