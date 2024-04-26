package ExemploEstrutura;

import java.util.LinkedList;

public class ExemploVetor {
	
	public static void man(String[] args) {
		int[] numeros = new int[3];
		
		numeros[0] = 2;
		numeros[1] = 3;
		numeros[2] = 4;
		
		for(int i = 0; numeros.length > i; i++) {
			System.out.println(numeros[i]);
		}
		
		int[][] semibidimensional = new int [3][3];
		
		semibidimensional[0][0] = 10;
		semibidimensional[0][0] = 100;
		
		for(int i = 0; i < 3;i++) {
			for(int j = 0;j < 3; j++) {
				System.out.println(semibidimensional[i][j] + " ");
			}
			System.out.print(" ");
		}
		
		int[][][] terceiradimensao = new int[3][3][3];
		
		LinkedList<Integer> listaLinked = new LinkedList<Integer>();
		
		
		
		
	}

}
