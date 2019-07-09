package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(11, 1111);
		contas[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 2222);        
        contas[1] = cc2;
        
        System.out.println(contas[0].toString());
        
        ContaPoupanca ref = (ContaPoupanca) contas[1];
        //ContaCorrente ref2 = (ContaCorrente) contas[1];
        
        System.out.println(cc2.toString());
        System.out.println(ref.toString());

	}

}
