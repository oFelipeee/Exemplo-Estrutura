package ExemploEstrutura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploColection {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Atletico Mineiro");
		arrayList.add("Mirassol");
		arrayList.add("Novo Horizontino");
		arrayList.add("ITuano Futebol Clube");
		
		Collections.sort(arrayList);
		
		System.out.println(arrayList);
		
		
		

	}

}
