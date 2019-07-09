package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaEspecial ce = new ContaEspecial(123, 456789);
		
		ContaCorrente cc = new ContaCorrente(111, 1111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 2222);
		cp.deposita(200.0);
		
		//cc.transfere(10, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}

}
