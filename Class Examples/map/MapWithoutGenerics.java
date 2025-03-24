package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapWithoutGenerics {

	public static void main(String[] args) {
		Map mp = new HashMap();
		mp.put(1,"Samadhan");
		mp.put(2, "Unnati");
		mp.put(3, "Jagannath");
		mp.put("Unnati", "Nandrekar");
		
		System.out.println(mp.get(2));
		System.out.println(mp.get("Unnati"));

	}

}
