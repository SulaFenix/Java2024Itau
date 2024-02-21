package br.com.eduardohmf.conta;

import br.com.eduardohmf.exception.LimiteCreditoExcedidoException;

public class ContaBancaria {
	
	public void fazerSaque(double quantia) throws LimiteCreditoExcedidoException {
		double limite = 1000.0;
		
		if (quantia > limite) {
			throw new LimiteCreditoExcedidoException(quantia - limite);
		} else {
			System.out.println("Saque realizado com sucesso");
		}
	}

}
