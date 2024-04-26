	package ExemploEstrutura;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Estrutura {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Moto");
		
		System.out.println("Elemento no HaseShet");
		for(String veiculo : hashSet) {
			System.out.println(veiculo);
		}
		
		Iterator<String> iterator = hashSet.iterator();
		
		LinkedHashSet<String> lkHash = new LinkedHashSet<String>();
		Iterator<String> iteratorLkHash = lkHash.iterator();
		
		Set<String> setMap = new TreeSet<String>();
		Iterator<String> setMapIterator = setMap.iterator();
		
		
		System.out.println("listando elementos com iterator");
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.print(item);
		}
		
		LinkedHashSet<String> set = new LinkedHashSet();
		
		
//		System.out.println(new String("Pedro") == new String("Pedro"));
//		System.out.println(new String("Pedro").equals(new String("Pedro")));
//		
//		GestaoDeEstudantes gs = new GestaoDeEstudantes();
//		MenuHandler menu = new MenuHandler(gs);
//		
//		System.out.print(gs.hashCode());
//		System.out.println(menu.hashCode());
		
	
		

	}

}
