package br.com.eduardohmf;

import br.com.eduardohmf.poo.Aluno;
import br.com.eduardohmf.poo.Carro;

//import br.com.eduardohmf.poo.Carro;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Bom dia turma");
		System.out.println("-------------------------------------------------");

		/*boolean condicao = true;
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
		
		
		System.out.println("-------------------------------------------------");
		Carro carro = new Carro("verde", "BYD", "Plus");
		System.out.println(carro.toString());
		System.out.println("-------------------------------------------------");
		carro.setCor("Azul");
		System.out.println(carro.toString());
		System.out.println("-------------------------------------------------");
		
		Carro jao = new Carro("Fiat", "Mobi");
		System.out.println(jao.toString());
		System.out.println("-------------------------------------------------");
		*/
		
		Aluno aluno1 = new Aluno("0001", "08/02/2024", "Fulano", "fulano@indra.com");
		/*aluno1.setNome("Fulano");
		aluno1.setEmail("fulano@indra.com");
		aluno1.setDtMatricula("08/02/2024");
		aluno1.setMatricula("0001");*/
		System.out.println(aluno1.toString());
		System.out.println("-------------------------------------------------");
		
		Aluno aluno2 = new Aluno("0002", "08/02/2024", "Beltrano", "beltrano@indra.com", "61 00000-0000");
		System.out.println(aluno2.toString());
		System.out.println("-------------------------------------------------");
	}
}
