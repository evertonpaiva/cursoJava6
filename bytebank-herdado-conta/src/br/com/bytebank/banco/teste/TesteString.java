package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura"; //object literal
		//String outro = new String("Alura");
		
		//String outra = nome.replace("A", "a");
		
		String outra = nome.toUpperCase();
		
		System.out.println(nome);
		System.out.println(outra);
		
		char c = nome.charAt(3); //char i
		System.out.println(c);

		int pos = nome.indexOf("ura");
		System.out.println(pos);

		String sub = nome.substring(1);
		System.out.println(sub);
		
		for(int i = 0; i < nome.length(); i++) {
		    System.out.println(nome.charAt(i));
		}
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);
	}
}
