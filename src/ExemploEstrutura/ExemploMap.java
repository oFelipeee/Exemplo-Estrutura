package ExemploEstrutura;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		
		map.put(1, "São Paulo");
		map.put(2, "Palmeiras");
		map.put(123, "Corinthians");
		
		map.forEach((key, valor) -> {
			System.out.println("Posicao no Ranking:" + key);
			System.out.println("Nome: " + valor);
		});
		
		Iterator<Map.Entry<Integer, String>> Iterator = map.entrySet().iterator();
			while(Iterator.hasNext()) {
				Map.Entry<Integer, String> entry = Iterator.next();
				System.out.println("KEY:" + entry.getKey() + "Nome" + entry.getValue());
			}
			
			for(Map.Entry<Integer, String> entry : map.entrySet()) {
				System.out.println(entry.getKey() + "==" + entry.getValue());
			}
			
			map.entrySet().stream().forEach(entry -> {
				System.out.println(entry.getKey() + "==" + entry.getValue());
			});
			
			Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
			
			hashTable.put(300, "Corinthians");
			hashTable.put(1, "Sao Paulo");
			hashTable.put(2, "Palmeiras");
			
			
			Enumeration<Integer> keys = hashTable.keys();
			while(keys.hasMoreElements()) {
				int key = keys.nextElement();
				String value = hashTable.get(key);
				System.out.println(key + " = " + value);
			}
			
			for(Map.Entry<Integer, String> entry : hashTable.entrySet()) {
				System.out.println(entry.getKey() + " = " + entry.getValue());
			}
			
			hashTable.entrySet().stream().forEach(entry -> {
			});
			
			LinkedHashMap<String, Integer> Map = new LinkedHashMap<>();
			
			Map.put("um", 1);
			Map.put("dois", 1);
			Map.put("tres", 1);
			
			TreeMap<String, Integer> Map1 = new TreeMap<>();
			Map1.put("um", 1);
			Map1.put("dois", 1);
			Map1.put("tres", 1);
			
		
	}

}
