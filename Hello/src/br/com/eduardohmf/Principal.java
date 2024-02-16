package br.com.eduardohmf;

import br.com.eduardohmf.poo.Carro;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bom dia turma");

		boolean condicao = true;
		if (!condicao) {
			System.out.println("Condição verdadeira");
		} else {
			System.out.println("Condição falsa");
		}

		int x = 5;
		if (x > 5) {
			System.out.println("x > 5");
		} else if (x < 5) {
			System.out.println("x < 5");
		} else {
			System.out.println("x == 5");
		}

		// case
		int z = 2;
		switch (z) {
		case 1:
			System.out.println("z == 1");
			break;
		case 2:
		case 3:
			System.out.println("z == 2 ou z == 3");
			break;
		case 10:
			System.out.println("z == 10");
			break;
		default:
			System.out.println("default");
			break;
		}
		
		Carro carro = new Carro();
		carro.andar();
	}
}
