package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(11, 1111);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 2222);        
        referencias[1] = cc2;
        
        Cliente cliente = new Cliente();
        referencias[2] = cliente;
        
        //System.out.println(contas[1].getNumero());
        
        ContaPoupanca ref = (ContaPoupanca) referencias[1];
        //ContaCorrente ref2 = (ContaCorrente) referencias[1];
        
        System.out.println(cc2.toString());
        System.out.println(ref.toString());

	}

}
