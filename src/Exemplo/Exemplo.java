package Exemplo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo {

	public static void main(String[] args) {
		
		
				
			HashSet<Integer> num1 = new HashSet<Integer>();
			num1.add(13);
			num1.add(1254);
			num1.add(154);
			num1.add(154);
			System.out.println("listando desordenado");
			for(int valor : num1) {
				System.out.println(valor);
				
			}
			

			LinkedHashSet<Integer> num2 = new LinkedHashSet<Integer>();
			num2.add(13);
			num2.add(1254);
			num2.add(154);
			num2.add(154);
			System.out.println("List0ando ordenado");
			for(int valor : num2) {
				System.out.println(valor);
				
				
			}
			
			Set treeSet = new TreeSet<Integer>(num1);
			
		
			
			
		
	}
	
	

}
