package atvd04;

import java.util.Scanner;
public class testeCarro {
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Feito sem construtor.
		carro primeiroCarro = new carro();
		pessoa primeiraPessoa = new pessoa();
		primeiroCarro.setDono(primeiraPessoa);
		primeiraPessoa.setCarro(primeiroCarro);
		
		primeiroCarro.setTipo("HB20");
		primeiroCarro.setCor("Branco");
		primeiroCarro.setPlaca("ABC-1234");
		primeiroCarro.setNumPortas(4);
		
		primeiraPessoa.setNome("Isaac");
		primeiraPessoa.setIdade(21);
		primeiraPessoa.setSexo('M');
		
		System.out.println("carro: " + primeiroCarro.getTipo());
		System.out.println("Cor: " + primeiroCarro.getCor());
		System.out.println("Placa: " + primeiroCarro.getPlaca());
		System.out.println("Número de portas: " + primeiroCarro.getNumPortas());
		System.out.println("Esse carro pertence a: " + primeiroCarro.getDono().getNome());
		System.out.println();
		
		//Ações pela pessoa no objeto carro
		primeiraPessoa.ligarCarro();
		primeiraPessoa.acelerarCarro();
		primeiraPessoa.acelerarCarro();
		primeiraPessoa.frearCarro();
		primeiraPessoa.desligarCarro();
		System.out.println();
		
		
		//Feito com construtor.
		carro segundoCarro = new carro("Celta", "Prata", "XXX-0000", 2);
		pessoa segundaPessoa = new pessoa("Yossef", 21, 'M');
		segundoCarro.setDono(segundaPessoa);
		segundaPessoa.setCarro(segundoCarro);
		
		System.out.println("carro: " + segundoCarro.getTipo());
		System.out.println("Cor: " + segundoCarro.getCor());
		System.out.println("Placa: " + segundoCarro.getPlaca());
		System.out.println("Número de portas: " + segundoCarro.getNumPortas());
		System.out.println("Esse carro pertence a: " + segundoCarro.getDono().getNome());
		System.out.println();
		
		//Ações pela pessoa no objeto carro
		segundaPessoa.ligarCarro();
		segundaPessoa.acelerarCarro();
		segundaPessoa.acelerarCarro();
		segundaPessoa.frearCarro();
		segundaPessoa.desligarCarro();
		System.out.println();
		
		
		//Print pelo ToString
		//System.out.println(primeiroCarro);
		//System.out.println(primeiraPessoa);
		//System.out.println(segundoCarro);
		//System.out.println(segundaPessoa);
		
		
	}//Fim do main
}//Fim do class
