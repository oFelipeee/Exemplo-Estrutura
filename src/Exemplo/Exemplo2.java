package Exemplo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Exemplo2 {

	public static void main(String[] args) {
			
		
//		Fazendo o arraylist:
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i = 1; i<= 10; i++) {
			arrayList.add(i);
		}
		System.out.println("Percorrendo o ARRAYLIST!");
		for(int num : arrayList) {
			System.out.println(num + " ");
		}
		System.out.println();
		
		
//		Fazendo o vector:
		Vector<Integer> vector = new Vector<>();
		for(int i = 1; i <= 10; i++) {
			vector.add(i);
		}
		System.out.println("Percorrendo o VECTOR!");
		for(int num : vector) {
			System.out.println(num + " ");
		}
		System.out.println();
		
		
//		Fazendo o linkedlist:
		LinkedList<Integer> linkedList = new LinkedList<>();
		for(int i = 1; i <= 10; i++) {
			linkedList.add(i);
		}
		System.out.println("Percorrendo o LINKEDLIST!");
		for(int num : linkedList) {
			System.out.println(num + " ");
		}
		System.out.println();
		
		

	}

}
