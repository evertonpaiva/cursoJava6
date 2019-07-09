package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		int[] idades = new int[10];
		String[] nomes = new String[5];
	
		int idade = 29; //Integer
        		
		//Autoboxing
		Integer idadeRef = Integer.valueOf(29);
        System.out.println(idadeRef.doubleValue());
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        
		//Unboxing
		int valor = idadeRef.intValue();
		
		String s = args[0];
		
		Integer numero = Integer.valueOf(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxing adicionando um primitivo numa lista de referencias
		numeros.add(idade);
		numeros.add(idadeRef);		

	}

}
