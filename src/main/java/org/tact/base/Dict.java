package org.tact.base;

import java.util.HashMap;
import java.util.Map;

public class Dict {
	
	public static void dic() {
		Map<String,String> dict1 = new HashMap<String,String>();
		dict1.put("ram", "8gb");
		dict1.put("ssd", "512gb");
		dict1.put("processor", "corei7");
		dict1.put("display", "1080");
		System.out.println("Items of Dictionary one " + dict1.toString());
		
		Map<String,String> dict2 = new HashMap<String,String>();
		dict2.put("os", "windows10");
		dict2.put("antivirus", "K7");
		dict2.put("office", "2018");
		System.out.println("Items of Dictionary two " + dict2.toString());
		
		Map<String,String> dict3 = new HashMap<String,String>();
		dict3.putAll(dict1);
		dict3.putAll(dict2);
		System.out.println("Concatenation of two Dictionary key-value pairs " + dict3.toString());
		}

}
